package net.lavedrine.homestock.item.dto;

import java.time.Instant;
import java.time.LocalDate;

public record ItemOutDto(Integer id,
                         String name,
                         String description,
                         Integer quantity,
                         LocalDate expirationDate,
                         Instant dateCreated,
                         Instant lastUpdated) {
}
