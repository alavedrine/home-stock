package net.lavedrine.homestock.item.command;

import java.time.Instant;
import java.time.LocalDate;

public record CreateItemCommand(Integer subCategoryId,
                                String name,
                                String description,
                                Integer quantity,
                                LocalDate expirationDate,
                                Instant dateCreated,
                                Instant lastUpdated) {

    public static CreateItemCommand createNewItemCommand(Integer categoryId, String name, String description, Integer quantity, LocalDate expirationDate) {
        Instant now = Instant.now();
        return new CreateItemCommand(
                categoryId,
                name,
                description,
                quantity,
                expirationDate,
                now,
                now);
    }
}
