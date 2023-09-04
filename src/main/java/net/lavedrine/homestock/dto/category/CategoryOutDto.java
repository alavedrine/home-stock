package net.lavedrine.homestock.dto.category;

public record CategoryOutDto(Integer id,
                             Integer parentId,
                             String name,
                             String description) {
}
