/*
 * This file is generated by jOOQ.
 */
package net.lavedrine.jooq.generated;


import java.util.Arrays;
import java.util.List;

import net.lavedrine.jooq.generated.tables.JCategory;
import net.lavedrine.jooq.generated.tables.JItem;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.category</code>.
     */
    public final JCategory CATEGORY = JCategory.CATEGORY;

    /**
     * The table <code>public.item</code>.
     */
    public final JItem ITEM = JItem.ITEM;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            JCategory.CATEGORY,
            JItem.ITEM
        );
    }
}