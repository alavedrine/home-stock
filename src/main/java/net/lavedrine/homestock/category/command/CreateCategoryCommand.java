package net.lavedrine.homestock.category.command;

public record CreateCategoryCommand(String name, String description, Integer parentId) {
}
