package net.lavedrine.homestock.dto.item;

import java.time.Instant;

public record ItemOutDto(Integer id,
                         String name,
                         String description,
                         Integer quantity,
                         Instant dateCreated,
                         Instant lastUpdated) {
}
