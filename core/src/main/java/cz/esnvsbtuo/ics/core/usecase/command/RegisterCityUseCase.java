package cz.esnvsbtuo.ics.core.usecase.command;

import cz.esnvsbtuo.ics.core.application.exception.InvalidCommandException;

public interface RegisterCityUseCase {
    void registerCity(RegisterCityCommand command) throws InvalidCommandException;

    public class RegisterCityCommand {
        public String cityName;

        public RegisterCityCommand(String cityName) {
            this.cityName = cityName;
        }
    }
}
