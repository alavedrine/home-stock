package net.lavedrine.homestock.domain;

import net.lavedrine.homestock.dto.home.HomeOutDto;

import java.time.Instant;

public record Home(String id, String name, Instant dateCreated, Instant lastUpdated) {
    public static Home fromDb(String id, String name, Instant dateCreated, Instant lastUpdated) {
        return new Home(id, name, dateCreated, lastUpdated);
    }

    public static HomeOutDto toDto(Home home) {
        return new HomeOutDto(home.id(), home.name(), home.dateCreated());
    }
}
