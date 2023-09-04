package net.lavedrine.homestock.repository;

import net.lavedrine.homestock.command.CreateCategoryCommand;
import net.lavedrine.homestock.domain.Category;
import net.lavedrine.jooq.generated.tables.records.CategoryRecord;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

import static net.lavedrine.jooq.generated.Tables.CATEGORY;

@Repository
public class CategoryRepository {
    private final Logger logger = LoggerFactory.getLogger(CategoryRepository.class);

    private final DSLContext jooq;

    public CategoryRepository(DSLContext jooq) {
        this.jooq = jooq;
    }

    public void insert(Integer homeId, CreateCategoryCommand category) {
        logger.debug(String.format("Insert category with name: '%s', description: '%s'", category.name(), category.description()));
        jooq.insertInto(CATEGORY)
                .set(CATEGORY.NAME, category.name())
                .set(CATEGORY.DESCRIPTION, category.description())
                .set(CATEGORY.PARENT_ID, category.parentId())
                .set(CATEGORY.HOME_ID, homeId)
                .execute();
    }

    public void update(Category category) {
        jooq.update(CATEGORY)
                .set(CATEGORY.NAME, category.name())
                .set(CATEGORY.DESCRIPTION, category.description())
                .where(CATEGORY.ID.eq(category.id()))
                .execute();
    }

    public Optional<Category> findById(Integer id) {
        logger.debug(String.format("Find category with id: '%s'", id));

        return jooq
                .selectFrom(CATEGORY)
                .where(CATEGORY.ID.eq(id))
                .fetchOptional()
                .map(this::mapFromRecord);
    }

    public Set<Category> getAll(Integer homeId) {
        logger.debug("Get all categories");
        return jooq.selectFrom(CATEGORY)
                .where(CATEGORY.HOME_ID.eq(homeId))
                .fetchSet(this::mapFromRecord);
    }

    public void delete(Integer homeId, Integer categoryId) {
        logger.debug("Delete category %s".formatted(categoryId));
        jooq.deleteFrom(CATEGORY)
                .where(CATEGORY.ID.eq(categoryId))
                .and(CATEGORY.HOME_ID.eq(homeId))
                .execute();
    }

    private Category mapFromRecord(CategoryRecord categoryRecord) {
        return Category.fromDb(
                categoryRecord.getId(),
                categoryRecord.getParentId(),
                categoryRecord.getName(),
                categoryRecord.getDescription(),
                categoryRecord.getHomeId()
        );
    }
}
