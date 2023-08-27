package net.lavedrine.homestock.category.domain;

public final class Category {
    private final Integer id;
    private final Integer parentId;
    private final String name;
    private final String description;

    public Category(Integer id,
                    Integer parentId,
                    String name,
                    String description) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.description = description;
    }

    public static Category fromDb(Integer id, Integer parentId, String name, String description) {
        return new Category(id, parentId, name, description);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getParentId() {
        return parentId;
    }
}

