package net.lavedrine.homestock.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record ItemInDto(String name,
                        String description,
                        Integer quantity,
                        @JsonProperty("expiration_date")
                        LocalDate expirationDate) {
}
