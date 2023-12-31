/*
 * This file is generated by jOOQ.
 */
package net.lavedrine.jooq.generated.tables.records;


import java.time.Instant;

import net.lavedrine.jooq.generated.tables.JItem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemRecord extends UpdatableRecordImpl<ItemRecord> implements Record10<Integer, String, Integer, String, Integer, Integer, Integer, String, Instant, Instant> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.item.id</code>.
     */
    public ItemRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.item.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.item.home_id</code>.
     */
    public ItemRecord setHomeId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.item.home_id</code>.
     */
    public String getHomeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.item.category_id</code>.
     */
    public ItemRecord setCategoryId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.item.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.item.name</code>.
     */
    public ItemRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.item.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.item.quantity</code>.
     */
    public ItemRecord setQuantity(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.item.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.item.percentage_quantity</code>.
     */
    public ItemRecord setPercentageQuantity(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.item.percentage_quantity</code>.
     */
    public Integer getPercentageQuantity() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.item.stock_limit</code>.
     */
    public ItemRecord setStockLimit(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.item.stock_limit</code>.
     */
    public Integer getStockLimit() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.item.description</code>.
     */
    public ItemRecord setDescription(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.item.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.item.date_created</code>.
     */
    public ItemRecord setDateCreated(Instant value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.item.date_created</code>.
     */
    public Instant getDateCreated() {
        return (Instant) get(8);
    }

    /**
     * Setter for <code>public.item.last_updated</code>.
     */
    public ItemRecord setLastUpdated(Instant value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.item.last_updated</code>.
     */
    public Instant getLastUpdated() {
        return (Instant) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, Integer, String, Integer, Integer, Integer, String, Instant, Instant> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, Integer, String, Integer, Integer, Integer, String, Instant, Instant> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JItem.ITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return JItem.ITEM.HOME_ID;
    }

    @Override
    public Field<Integer> field3() {
        return JItem.ITEM.CATEGORY_ID;
    }

    @Override
    public Field<String> field4() {
        return JItem.ITEM.NAME;
    }

    @Override
    public Field<Integer> field5() {
        return JItem.ITEM.QUANTITY;
    }

    @Override
    public Field<Integer> field6() {
        return JItem.ITEM.PERCENTAGE_QUANTITY;
    }

    @Override
    public Field<Integer> field7() {
        return JItem.ITEM.STOCK_LIMIT;
    }

    @Override
    public Field<String> field8() {
        return JItem.ITEM.DESCRIPTION;
    }

    @Override
    public Field<Instant> field9() {
        return JItem.ITEM.DATE_CREATED;
    }

    @Override
    public Field<Instant> field10() {
        return JItem.ITEM.LAST_UPDATED;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getHomeId();
    }

    @Override
    public Integer component3() {
        return getCategoryId();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Integer component5() {
        return getQuantity();
    }

    @Override
    public Integer component6() {
        return getPercentageQuantity();
    }

    @Override
    public Integer component7() {
        return getStockLimit();
    }

    @Override
    public String component8() {
        return getDescription();
    }

    @Override
    public Instant component9() {
        return getDateCreated();
    }

    @Override
    public Instant component10() {
        return getLastUpdated();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getHomeId();
    }

    @Override
    public Integer value3() {
        return getCategoryId();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Integer value5() {
        return getQuantity();
    }

    @Override
    public Integer value6() {
        return getPercentageQuantity();
    }

    @Override
    public Integer value7() {
        return getStockLimit();
    }

    @Override
    public String value8() {
        return getDescription();
    }

    @Override
    public Instant value9() {
        return getDateCreated();
    }

    @Override
    public Instant value10() {
        return getLastUpdated();
    }

    @Override
    public ItemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ItemRecord value2(String value) {
        setHomeId(value);
        return this;
    }

    @Override
    public ItemRecord value3(Integer value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public ItemRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public ItemRecord value5(Integer value) {
        setQuantity(value);
        return this;
    }

    @Override
    public ItemRecord value6(Integer value) {
        setPercentageQuantity(value);
        return this;
    }

    @Override
    public ItemRecord value7(Integer value) {
        setStockLimit(value);
        return this;
    }

    @Override
    public ItemRecord value8(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ItemRecord value9(Instant value) {
        setDateCreated(value);
        return this;
    }

    @Override
    public ItemRecord value10(Instant value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public ItemRecord values(Integer value1, String value2, Integer value3, String value4, Integer value5, Integer value6, Integer value7, String value8, Instant value9, Instant value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemRecord
     */
    public ItemRecord() {
        super(JItem.ITEM);
    }

    /**
     * Create a detached, initialised ItemRecord
     */
    public ItemRecord(Integer id, String homeId, Integer categoryId, String name, Integer quantity, Integer percentageQuantity, Integer stockLimit, String description, Instant dateCreated, Instant lastUpdated) {
        super(JItem.ITEM);

        setId(id);
        setHomeId(homeId);
        setCategoryId(categoryId);
        setName(name);
        setQuantity(quantity);
        setPercentageQuantity(percentageQuantity);
        setStockLimit(stockLimit);
        setDescription(description);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
    }
}
