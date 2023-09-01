/*
 * This file is generated by jOOQ.
 */
package net.lavedrine.jooq.generated.tables;


import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import net.lavedrine.homestock.configuration.jooq.utils.InstantConverter;
import net.lavedrine.jooq.generated.Keys;
import net.lavedrine.jooq.generated.Public;
import net.lavedrine.jooq.generated.tables.records.ItemRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JItem extends TableImpl<ItemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.item</code>
     */
    public static final JItem ITEM = new JItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemRecord> getRecordType() {
        return ItemRecord.class;
    }

    /**
     * The column <code>public.item.id</code>.
     */
    public final TableField<ItemRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.item.category_id</code>.
     */
    public final TableField<ItemRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.item.name</code>.
     */
    public final TableField<ItemRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.item.quantity</code>.
     */
    public final TableField<ItemRecord, Integer> QUANTITY = createField(DSL.name("quantity"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.item.percentage_quantity</code>.
     */
    public final TableField<ItemRecord, Integer> PERCENTAGE_QUANTITY = createField(DSL.name("percentage_quantity"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.item.stock_limit</code>.
     */
    public final TableField<ItemRecord, Integer> STOCK_LIMIT = createField(DSL.name("stock_limit"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.item.description</code>.
     */
    public final TableField<ItemRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.item.date_created</code>.
     */
    public final TableField<ItemRecord, Instant> DATE_CREATED = createField(DSL.name("date_created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new InstantConverter());

    /**
     * The column <code>public.item.last_updated</code>.
     */
    public final TableField<ItemRecord, Instant> LAST_UPDATED = createField(DSL.name("last_updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "", new InstantConverter());

    private JItem(Name alias, Table<ItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private JItem(Name alias, Table<ItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.item</code> table reference
     */
    public JItem(String alias) {
        this(DSL.name(alias), ITEM);
    }

    /**
     * Create an aliased <code>public.item</code> table reference
     */
    public JItem(Name alias) {
        this(alias, ITEM);
    }

    /**
     * Create a <code>public.item</code> table reference
     */
    public JItem() {
        this(DSL.name("item"), null);
    }

    public <O extends Record> JItem(Table<O> child, ForeignKey<O, ItemRecord> key) {
        super(child, key, ITEM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ItemRecord, Integer> getIdentity() {
        return (Identity<ItemRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ItemRecord> getPrimaryKey() {
        return Keys.PK_ITEM_ID;
    }

    @Override
    public List<ForeignKey<ItemRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ITEM__FK_CATEGORY_ID);
    }

    private transient JCategory _category;

    /**
     * Get the implicit join path to the <code>public.category</code> table.
     */
    public JCategory category() {
        if (_category == null)
            _category = new JCategory(this, Keys.ITEM__FK_CATEGORY_ID);

        return _category;
    }

    @Override
    public List<Check<ItemRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("percentage_quantity_limit"), "(((percentage_quantity > 0) AND (percentage_quantity < 100)))", true)
        );
    }

    @Override
    public JItem as(String alias) {
        return new JItem(DSL.name(alias), this);
    }

    @Override
    public JItem as(Name alias) {
        return new JItem(alias, this);
    }

    @Override
    public JItem as(Table<?> alias) {
        return new JItem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JItem rename(String name) {
        return new JItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JItem rename(Name name) {
        return new JItem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JItem rename(Table<?> name) {
        return new JItem(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, String, Integer, Integer, Integer, String, Instant, Instant> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Integer, ? super Integer, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super String, ? super Instant, ? super Instant, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Integer, ? super Integer, ? super String, ? super Integer, ? super Integer, ? super Integer, ? super String, ? super Instant, ? super Instant, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
