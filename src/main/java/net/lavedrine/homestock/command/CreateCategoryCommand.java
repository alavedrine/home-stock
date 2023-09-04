package net.lavedrine.homestock.command;

public record CreateCategoryCommand(String name, String description, Integer parentId) {
}
