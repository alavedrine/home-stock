package net.lavedrine.homestock.domain;

public record Category(Integer id, Integer parentId, String name, String description) {

    public static Category fromDb(Integer id, Integer parentId, String name, String description) {
        return new Category(id, parentId, name, description);
    }
}

