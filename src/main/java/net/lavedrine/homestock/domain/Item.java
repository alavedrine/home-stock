package net.lavedrine.homestock.domain;

import java.time.Instant;

public record Item(Integer id,
                   Integer categoryId,
                   String name,
                   String description,
                   Integer quantity,
                   Integer percentageQuantity,
                   Integer stockLimit,
                   Instant dateCreated,
                   Instant lastUpdated) {
    public static Item fromDb(Integer id,
                              Integer categoryId,
                              String name,
                              String description,
                              Integer quantity,
                              Integer percentageQuantity,
                              Integer stockLimit,
                              Instant dateCreated,
                              Instant lastUpdated) {
        return new Item(id, categoryId, name, description, quantity,
                percentageQuantity, stockLimit, dateCreated, lastUpdated);
    }
}
