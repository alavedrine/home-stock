package net.lavedrine.homestock.category.dto;

public record CategoryOutDto(Integer id,
                             Integer parentId,
                             String name,
                             String description) {
}
