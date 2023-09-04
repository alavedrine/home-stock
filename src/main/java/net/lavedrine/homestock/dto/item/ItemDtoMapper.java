package net.lavedrine.homestock.dto.item;

import net.lavedrine.homestock.domain.Item;

public class ItemDtoMapper {

    private ItemDtoMapper() {
        throw new IllegalStateException("Utility class");
    }


    public static ItemOutDto toOutDto(Item item) {
        return new ItemOutDto(
                item.id(),
                item.name(),
                item.description(),
                item.quantity(),
                item.dateCreated(),
                item.lastUpdated());
    }


}
