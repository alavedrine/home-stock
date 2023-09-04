package net.lavedrine.homestock.dto.category.item;

public record ItemInDto(String name,
                        String description,
                        Integer quantity,
                        Integer percentageQuantity,
                        Integer stockLimit) {
}
