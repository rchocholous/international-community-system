package cz.esnvsbtuo.ics.adapter.persistence;

import cz.esnvsbtuo.ics.core.application.exception.EntityNotFoundException;
import cz.esnvsbtuo.ics.core.domain.City;
import cz.esnvsbtuo.ics.core.port.FindCityByNamePort;
import cz.esnvsbtuo.ics.core.port.FindNextCityIdPort;
import cz.esnvsbtuo.ics.core.port.SaveCityPort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CityRepository implements SaveCityPort, FindCityByNamePort, FindNextCityIdPort {

    private Map<City.CityId, City> cities = new HashMap<>();

    @Override
    public City findCityByName(String cityName) throws EntityNotFoundException {
        return cities.values().parallelStream().filter(city -> cityName.equalsIgnoreCase(city.getName())).findAny().orElseThrow(() -> new EntityNotFoundException("City with specified name not found."));
    }

    @Override
    public City.CityId findNextCityIdPort() {
        return cities.keySet().parallelStream().max(Comparator.comparingLong(City.CityId::get)).orElse(new City.CityId(1L));
    }

    @Override
    public void saveCity(City city) {
        cities.put(city.getId(), city);
    }
}
