package net.lavedrine.homestock.item.dto;

public record ItemInDto(String name,
                        String description,
                        Integer quantity,
                        Integer percentageQuantity,
                        Integer stockLimit) {
}
