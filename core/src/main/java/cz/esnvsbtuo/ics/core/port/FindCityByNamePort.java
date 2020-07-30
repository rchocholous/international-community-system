package cz.esnvsbtuo.ics.core.port;

import cz.esnvsbtuo.ics.core.application.exception.EntityNotFoundException;
import cz.esnvsbtuo.ics.core.domain.City;

public interface FindCityByNamePort {
    City findCityByName(String cityName) throws EntityNotFoundException;
}
