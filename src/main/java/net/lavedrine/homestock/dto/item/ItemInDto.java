package net.lavedrine.homestock.dto.item;

public record ItemInDto(String name,
                        String description,
                        Integer quantity,
                        Integer percentageQuantity,
                        Integer stockLimit) {
}
