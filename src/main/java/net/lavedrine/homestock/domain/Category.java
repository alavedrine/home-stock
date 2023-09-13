package net.lavedrine.homestock.domain;

public record Category(Integer id, Integer parentId, String name, String description, String homeId) {

    public static Category fromDb(Integer id, Integer parentId, String name, String description, String homeId) {
        return new Category(id, parentId, name, description, homeId);
    }
}

