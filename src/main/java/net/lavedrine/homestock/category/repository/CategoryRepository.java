package net.lavedrine.homestock.category.repository;

import net.lavedrine.homestock.category.command.CreateCategoryCommand;
import net.lavedrine.homestock.category.domain.Category;
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

    public void insert(CreateCategoryCommand category) {
        logger.debug(String.format("Insert category with name: '%s', description: '%s'", category.name(), category.description()));
        jooq.insertInto(CATEGORY)
                .set(CATEGORY.NAME, category.name())
                .set(CATEGORY.DESCRIPTION, category.description())
                .set(CATEGORY.PARENT_ID, category.parentId())
                .execute();
    }

    public void update(Category category) {
        jooq.update(CATEGORY)
                .set(CATEGORY.NAME, category.getName())
                .set(CATEGORY.DESCRIPTION, category.getDescription())
                .where(CATEGORY.ID.eq(category.getId()))
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

    public Set<Category> getAll() {
        logger.debug("Get all categories");
        return jooq.selectFrom(CATEGORY).fetchSet(this::mapFromRecord);
    }

    private Category mapFromRecord(CategoryRecord categoryRecord) {
        return Category.fromDb(
                categoryRecord.getId(),
                categoryRecord.getParentId(),
                categoryRecord.getName(),
                categoryRecord.getDescription()
        );
    }
}
