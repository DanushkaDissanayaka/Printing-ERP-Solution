/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model.tables;


import com.infsystem.infsystem.databse.jooq.model.Inf;
import com.infsystem.infsystem.databse.jooq.model.Keys;
import com.infsystem.infsystem.databse.jooq.model.tables.records.MaterialRecord;

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
public class Material extends TableImpl<MaterialRecord> {

    private static final long serialVersionUID = -699987089;

    /**
     * The reference instance of <code>inf.material</code>
     */
    public static final Material MATERIAL = new Material();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MaterialRecord> getRecordType() {
        return MaterialRecord.class;
    }

    /**
     * The column <code>inf.material.id</code>.
     */
    public final TableField<MaterialRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.material.name</code>.
     */
    public final TableField<MaterialRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>inf.material.categoryId</code>.
     */
    public final TableField<MaterialRecord, Integer> CATEGORYID = createField("categoryId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>inf.material.availableQty</code>.
     */
    public final TableField<MaterialRecord, Integer> AVAILABLEQTY = createField("availableQty", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>inf.material.pendingQty</code>.
     */
    public final TableField<MaterialRecord, Integer> PENDINGQTY = createField("pendingQty", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>inf.material.brand</code>.
     */
    public final TableField<MaterialRecord, String> BRAND = createField("brand", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>inf.material.description</code>.
     */
    public final TableField<MaterialRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>inf.material.trigerLimit</code>.
     */
    public final TableField<MaterialRecord, Integer> TRIGERLIMIT = createField("trigerLimit", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>inf.material</code> table reference
     */
    public Material() {
        this("material", null);
    }

    /**
     * Create an aliased <code>inf.material</code> table reference
     */
    public Material(String alias) {
        this(alias, MATERIAL);
    }

    private Material(String alias, Table<MaterialRecord> aliased) {
        this(alias, aliased, null);
    }

    private Material(String alias, Table<MaterialRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MaterialRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MATERIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MaterialRecord> getPrimaryKey() {
        return Keys.KEY_MATERIAL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MaterialRecord>> getKeys() {
        return Arrays.<UniqueKey<MaterialRecord>>asList(Keys.KEY_MATERIAL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MaterialRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MaterialRecord, ?>>asList(Keys.PK_MATERIAL_MATERIALCATOGORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Material as(String alias) {
        return new Material(alias, this);
    }

    /**
     * Rename this table
     */
    public Material rename(String name) {
        return new Material(name, null);
    }
}
