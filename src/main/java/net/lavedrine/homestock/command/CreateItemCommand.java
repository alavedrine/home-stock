package net.lavedrine.homestock.command;

import java.time.Instant;

public record CreateItemCommand(Integer subCategoryId,
                                String name,
                                String description,
                                Integer quantity,
                                Integer percentageQuantity,
                                Integer stockLimit,
                                Instant dateCreated,
                                Instant lastUpdated) {

    public static CreateItemCommand createNewItemCommand(Integer categoryId, String name,
                                                         String description, Integer quantity,
                                                         Integer percentageQuantity, Integer stockLimit) {
        Instant now = Instant.now();
        return new CreateItemCommand(
                categoryId,
                name,
                description,
                quantity,
                percentageQuantity,
                stockLimit,
                now,
                now);
    }
}
