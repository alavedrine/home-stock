package net.lavedrine.homestock.dto.category;

import net.lavedrine.homestock.command.CreateCategoryCommand;
import net.lavedrine.homestock.domain.Category;

public class CategoryDtoMapper {

    private CategoryDtoMapper() {
        throw new IllegalStateException("Utility class");
    }

    public static CreateCategoryCommand toCommand(CategoryInDto dto) {
        return new CreateCategoryCommand(dto.name(), dto.description(), dto.parentId());
    }

    public static CategoryOutDto toOutDto(Category category) {
        return new CategoryOutDto(category.id(), category.parentId(), category.name(), category.description());
    }
}
