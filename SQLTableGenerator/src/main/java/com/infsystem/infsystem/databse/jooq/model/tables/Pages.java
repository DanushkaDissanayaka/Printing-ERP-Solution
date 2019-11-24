/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model.tables;


import com.infsystem.infsystem.databse.jooq.model.Inf;
import com.infsystem.infsystem.databse.jooq.model.Keys;
import com.infsystem.infsystem.databse.jooq.model.tables.records.PagesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pages extends TableImpl<PagesRecord> {

    private static final long serialVersionUID = -1026016279;

    /**
     * The reference instance of <code>inf.pages</code>
     */
    public static final Pages PAGES = new Pages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PagesRecord> getRecordType() {
        return PagesRecord.class;
    }

    /**
     * The column <code>inf.pages.id</code>.
     */
    public final TableField<PagesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.pages.pageNumber</code>.
     */
    public final TableField<PagesRecord, Integer> PAGENUMBER = createField("pageNumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.pages.chapterId</code>.
     */
    public final TableField<PagesRecord, Integer> CHAPTERID = createField("chapterId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.pages.availableQty</code>.
     */
    public final TableField<PagesRecord, Integer> AVAILABLEQTY = createField("availableQty", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>inf.pages</code> table reference
     */
    public Pages() {
        this("pages", null);
    }

    /**
     * Create an aliased <code>inf.pages</code> table reference
     */
    public Pages(String alias) {
        this(alias, PAGES);
    }

    private Pages(String alias, Table<PagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pages(String alias, Table<PagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Inf.INF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PagesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PagesRecord> getPrimaryKey() {
        return Keys.KEY_PAGES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PagesRecord>> getKeys() {
        return Arrays.<UniqueKey<PagesRecord>>asList(Keys.KEY_PAGES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PagesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PagesRecord, ?>>asList(Keys.FK_PAGE_CHAPTER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pages as(String alias) {
        return new Pages(alias, this);
    }

    /**
     * Rename this table
     */
    public Pages rename(String name) {
        return new Pages(name, null);
    }
}
