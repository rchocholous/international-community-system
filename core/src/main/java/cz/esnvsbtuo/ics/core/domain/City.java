package cz.esnvsbtuo.ics.core.domain;

import cz.esnvsbtuo.ics.infrastructure.AggregateRoot;

public class City implements AggregateRoot {
    private CityId cityId;
    private String name;

    // Constructor for purpose of creating CityId
    private City() {}

    public City(CityId cityId, String name) {
        this.cityId = cityId;
        this.name = name;
    }

    @Override
    public CityId getId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public static class CityId {
        private Long value;

        public CityId(Long value) {
            this.value = value;
        }

        public Long get() {
            return value;
        }
    }
}
