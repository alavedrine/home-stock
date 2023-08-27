package net.lavedrine.homestock.item.domain;

import java.time.Instant;
import java.time.LocalDate;

public class Item {
    private final Integer id;
    private final Integer subCategoryId;
    private final String name;
    private final String description;
    private final Integer quantity;
    private final LocalDate expirationDate;
    private final Instant dateCreated;
    private final Instant lastUpdated;

    public Item(Integer id,
                Integer subCategoryId,
                String name,
                String description,
                Integer quantity,
                LocalDate expirationDate,
                Instant dateCreated,
                Instant lastUpdated) {
        this.id = id;
        this.subCategoryId = subCategoryId;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    public static Item fromDb(Integer id,
                              Integer subCategoryId,
                              String name,
                              String description,
                              Integer quantity,
                              LocalDate expirationDate,
                              Instant dateCreated,
                              Instant lastUpdated) {
        return new Item(id, subCategoryId, name, description, quantity, expirationDate, dateCreated, lastUpdated);
    }


    public Integer getId() {
        return id;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public Instant getLastUpdated() {
        return lastUpdated;
    }
}
