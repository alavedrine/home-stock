/*
 * This file is generated by jOOQ.
 */
package net.lavedrine.jooq.generated;


import net.lavedrine.jooq.generated.tables.JCategory;
import net.lavedrine.jooq.generated.tables.JHome;
import net.lavedrine.jooq.generated.tables.JItem;
import net.lavedrine.jooq.generated.tables.records.CategoryRecord;
import net.lavedrine.jooq.generated.tables.records.HomeRecord;
import net.lavedrine.jooq.generated.tables.records.ItemRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CategoryRecord> PK_CATEGORY_ID = Internal.createUniqueKey(JCategory.CATEGORY, DSL.name("pk_category_id"), new TableField[] { JCategory.CATEGORY.ID }, true);
    public static final UniqueKey<HomeRecord> PK_HOME_ID = Internal.createUniqueKey(JHome.HOME, DSL.name("pk_home_id"), new TableField[] { JHome.HOME.ID }, true);
    public static final UniqueKey<ItemRecord> PK_ITEM_ID = Internal.createUniqueKey(JItem.ITEM, DSL.name("pk_item_id"), new TableField[] { JItem.ITEM.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CategoryRecord, HomeRecord> CATEGORY__FK_HOME_ID = Internal.createForeignKey(JCategory.CATEGORY, DSL.name("fk_home_id"), new TableField[] { JCategory.CATEGORY.HOME_ID }, Keys.PK_HOME_ID, new TableField[] { JHome.HOME.ID }, true);
    public static final ForeignKey<CategoryRecord, CategoryRecord> CATEGORY__FK_PARENT_CATEGORY_ID = Internal.createForeignKey(JCategory.CATEGORY, DSL.name("fk_parent_category_id"), new TableField[] { JCategory.CATEGORY.PARENT_ID }, Keys.PK_CATEGORY_ID, new TableField[] { JCategory.CATEGORY.ID }, true);
    public static final ForeignKey<ItemRecord, CategoryRecord> ITEM__FK_CATEGORY_ID = Internal.createForeignKey(JItem.ITEM, DSL.name("fk_category_id"), new TableField[] { JItem.ITEM.CATEGORY_ID }, Keys.PK_CATEGORY_ID, new TableField[] { JCategory.CATEGORY.ID }, true);
    public static final ForeignKey<ItemRecord, HomeRecord> ITEM__FK_HOME_ID = Internal.createForeignKey(JItem.ITEM, DSL.name("fk_home_id"), new TableField[] { JItem.ITEM.HOME_ID }, Keys.PK_HOME_ID, new TableField[] { JHome.HOME.ID }, true);
}
