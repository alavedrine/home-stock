package net.lavedrine.homestock.dto.home;

import java.time.Instant;

public record HomeOutDto(String id, String name, Instant dateCreated) {
}
