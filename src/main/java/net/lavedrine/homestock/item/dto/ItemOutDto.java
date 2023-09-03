package net.lavedrine.homestock.item.dto;

import java.time.Instant;

public record ItemOutDto(Integer id,
                         String name,
                         String description,
                         Integer quantity,
                         Instant dateCreated,
                         Instant lastUpdated) {
}
