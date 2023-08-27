package net.lavedrine.homestock.item.dto;

import net.lavedrine.homestock.item.domain.Item;

public class ItemDtoMapper {

    public static ItemOutDto toOutDto(Item item) {
        return new ItemOutDto(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getQuantity(),
                item.getExpirationDate(),
                item.getDateCreated(),
                item.getLastUpdated());
    }


}
