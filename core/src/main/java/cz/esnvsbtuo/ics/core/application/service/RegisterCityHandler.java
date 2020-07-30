package cz.esnvsbtuo.ics.core.application.service;

import cz.esnvsbtuo.ics.core.application.exception.EntityNotFoundException;
import cz.esnvsbtuo.ics.core.application.exception.InvalidCommandException;
import cz.esnvsbtuo.ics.core.domain.City;
import cz.esnvsbtuo.ics.core.port.FindCityByNamePort;
import cz.esnvsbtuo.ics.core.port.FindNextCityIdPort;
import cz.esnvsbtuo.ics.core.port.SaveCityPort;
import cz.esnvsbtuo.ics.core.usecase.command.RegisterCityUseCase;

public class RegisterCityHandler implements RegisterCityUseCase {
    private SaveCityPort saveCityPort;
    private FindCityByNamePort findCityByNamePort;
    private FindNextCityIdPort findNextCityIdPort;

    public RegisterCityHandler(SaveCityPort saveCityPort, FindCityByNamePort findCityByNamePort, FindNextCityIdPort findNextCityIdPort) {
        this.saveCityPort = saveCityPort;
        this.findCityByNamePort = findCityByNamePort;
        this.findNextCityIdPort = findNextCityIdPort;
    }

    @Override
    public void registerCity(RegisterCityCommand command) throws InvalidCommandException {
        City existingCity;
        try {
            existingCity = findCityByNamePort.findCityByName(command.cityName);
        } catch (EntityNotFoundException e) {
            existingCity = null;
        }
        if(existingCity == null) {
            throw new InvalidCommandException("City with this name already exist!");
        }
        final City newCity = this.createCity(command.cityName);
        saveCityPort.saveCity(newCity);

        //Todo publish CityRegisteredEvent
    }


    private City createCity(String cityName) {
        final City.CityId cityId = findNextCityIdPort.findNextCityIdPort();
        return new City(cityId, cityName);
    }
}
