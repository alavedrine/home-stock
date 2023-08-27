package net.lavedrine.homestock.category.dto;

import net.lavedrine.homestock.category.command.CreateCategoryCommand;
import net.lavedrine.homestock.category.domain.Category;

public class CategoryDtoMapper {

    public static CreateCategoryCommand toCommand(CategoryInDto dto) {
        return new CreateCategoryCommand(dto.name(), dto.description(), dto.parentId());
    }

    public static CategoryOutDto toOutDto(Category category) {
        return new CategoryOutDto(category.getId(), category.getParentId(), category.getName(), category.getDescription());
    }
}
