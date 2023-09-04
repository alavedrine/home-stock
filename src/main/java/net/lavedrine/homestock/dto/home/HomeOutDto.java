package net.lavedrine.homestock.dto.home;

import java.time.Instant;

public record HomeOutDto(Integer id, String name, Instant dateCreated) {
}
