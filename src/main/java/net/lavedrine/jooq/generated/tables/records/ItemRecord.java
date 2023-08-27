/*
 * This file is generated by jOOQ.
 */
package net.lavedrine.jooq.generated.tables.records;


import java.time.Instant;
import java.time.LocalDate;

import net.lavedrine.jooq.generated.tables.JItem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemRecord extends UpdatableRecordImpl<ItemRecord> implements Record8<Integer, Integer, String, Integer, String, LocalDate, Instant, Instant> {

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
     * Setter for <code>public.item.category_id</code>.
     */
    public ItemRecord setCategoryId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.item.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.item.name</code>.
     */
    public ItemRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.item.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.item.quantity</code>.
     */
    public ItemRecord setQuantity(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.item.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.item.description</code>.
     */
    public ItemRecord setDescription(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.item.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.item.expiration_date</code>.
     */
    public ItemRecord setExpirationDate(LocalDate value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.item.expiration_date</code>.
     */
    public LocalDate getExpirationDate() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for <code>public.item.date_created</code>.
     */
    public ItemRecord setDateCreated(Instant value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.item.date_created</code>.
     */
    public Instant getDateCreated() {
        return (Instant) get(6);
    }

    /**
     * Setter for <code>public.item.last_updated</code>.
     */
    public ItemRecord setLastUpdated(Instant value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.item.last_updated</code>.
     */
    public Instant getLastUpdated() {
        return (Instant) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, String, Integer, String, LocalDate, Instant, Instant> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, String, Integer, String, LocalDate, Instant, Instant> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JItem.ITEM.ID;
    }

    @Override
    public Field<Integer> field2() {
        return JItem.ITEM.CATEGORY_ID;
    }

    @Override
    public Field<String> field3() {
        return JItem.ITEM.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return JItem.ITEM.QUANTITY;
    }

    @Override
    public Field<String> field5() {
        return JItem.ITEM.DESCRIPTION;
    }

    @Override
    public Field<LocalDate> field6() {
        return JItem.ITEM.EXPIRATION_DATE;
    }

    @Override
    public Field<Instant> field7() {
        return JItem.ITEM.DATE_CREATED;
    }

    @Override
    public Field<Instant> field8() {
        return JItem.ITEM.LAST_UPDATED;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getCategoryId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer component4() {
        return getQuantity();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public LocalDate component6() {
        return getExpirationDate();
    }

    @Override
    public Instant component7() {
        return getDateCreated();
    }

    @Override
    public Instant component8() {
        return getLastUpdated();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getCategoryId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Integer value4() {
        return getQuantity();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public LocalDate value6() {
        return getExpirationDate();
    }

    @Override
    public Instant value7() {
        return getDateCreated();
    }

    @Override
    public Instant value8() {
        return getLastUpdated();
    }

    @Override
    public ItemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ItemRecord value2(Integer value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public ItemRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ItemRecord value4(Integer value) {
        setQuantity(value);
        return this;
    }

    @Override
    public ItemRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ItemRecord value6(LocalDate value) {
        setExpirationDate(value);
        return this;
    }

    @Override
    public ItemRecord value7(Instant value) {
        setDateCreated(value);
        return this;
    }

    @Override
    public ItemRecord value8(Instant value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public ItemRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, LocalDate value6, Instant value7, Instant value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
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
    public ItemRecord(Integer id, Integer categoryId, String name, Integer quantity, String description, LocalDate expirationDate, Instant dateCreated, Instant lastUpdated) {
        super(JItem.ITEM);

        setId(id);
        setCategoryId(categoryId);
        setName(name);
        setQuantity(quantity);
        setDescription(description);
        setExpirationDate(expirationDate);
        setDateCreated(dateCreated);
        setLastUpdated(lastUpdated);
    }
}
