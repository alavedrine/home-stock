package net.lavedrine.homestock.item.repository;

import net.lavedrine.homestock.item.command.CreateItemCommand;
import net.lavedrine.homestock.item.domain.Item;
import net.lavedrine.jooq.generated.tables.records.ItemRecord;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static net.lavedrine.jooq.generated.Tables.ITEM;

@Repository
public class ItemRepository {
    private final Logger logger = LoggerFactory.getLogger(ItemRepository.class);

    private final DSLContext jooq;

    public ItemRepository(DSLContext jooq) {
        this.jooq = jooq;
    }

    public void insert(CreateItemCommand command) {
        logger.debug("Insert item: %s".formatted(command));

        jooq.insertInto(ITEM)
                .set(ITEM.CATEGORY_ID, command.subCategoryId())
                .set(ITEM.NAME, command.name())
                .set(ITEM.DESCRIPTION, command.description())
                .set(ITEM.QUANTITY, command.quantity())
                .set(ITEM.PERCENTAGE_QUANTITY, command.percentageQuantity())
                .set(ITEM.STOCK_LIMIT, command.stockLimit())
                .set(ITEM.DATE_CREATED, command.dateCreated())
                .set(ITEM.LAST_UPDATED, command.lastUpdated())
                .execute();
    }

    public Optional<Item> findById(Integer id) {
        logger.debug("Find item with id: '%s'".formatted(id));
        return jooq
                .selectFrom(ITEM)
                .where(ITEM.ID.eq(id))
                .fetchOptional()
                .map(this::mapFromRecord);
    }

    public List<Item> getAllForCategory(Integer categoryId) {
        logger.debug(String.format("Get all items for subCategory: %s", categoryId));
        return jooq
                .selectFrom(ITEM)
                .where(ITEM.CATEGORY_ID.eq(categoryId))
                .fetch(this::mapFromRecord);
    }

    public void adjust(Integer itemId, Integer quantity) {
        jooq.update(ITEM)
                .set(ITEM.QUANTITY, quantity)
                .where(ITEM.ID.eq(itemId))
                .execute();
    }

    private Item mapFromRecord(ItemRecord r) {
        return Item.fromDb(
                r.getId(),
                r.getCategoryId(),
                r.getName(),
                r.getDescription(),
                r.getQuantity(),
                r.getPercentageQuantity(),
                r.getStockLimit(),
                r.getDateCreated(),
                r.getLastUpdated());
    }
}
