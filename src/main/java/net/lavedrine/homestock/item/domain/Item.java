package net.lavedrine.homestock.item.domain;

import java.time.Instant;

public class Item {
    private final Integer id;
    private final Integer categoryId;
    private final String name;
    private final String description;
    private final Integer quantity;
    private final Integer percentageQuantity;
    private final Integer stockLimit;
    private final Instant dateCreated;
    private final Instant lastUpdated;

    private Item(Integer id,
                 Integer categoryId,
                 String name,
                 String description,
                 Integer quantity,
                 Integer percentageQuantity,
                 Integer stockLimit,
                 Instant dateCreated,
                 Instant lastUpdated) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.percentageQuantity = percentageQuantity;
        this.stockLimit = stockLimit;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

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


    public Integer getId() {
        return id;
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

    public Instant getDateCreated() {
        return dateCreated;
    }

    public Instant getLastUpdated() {
        return lastUpdated;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getPercentageQuantity() {
        return percentageQuantity;
    }

    public Integer getStockLimit() {
        return stockLimit;
    }
}
