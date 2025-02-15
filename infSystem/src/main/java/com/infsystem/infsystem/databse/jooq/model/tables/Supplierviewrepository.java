/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model.tables;


import com.infsystem.infsystem.databse.jooq.model.Inf;
import com.infsystem.infsystem.databse.jooq.model.tables.records.SupplierviewrepositoryRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Supplierviewrepository extends TableImpl<SupplierviewrepositoryRecord> {

    private static final long serialVersionUID = 1261831839;

    /**
     * The reference instance of <code>inf.supplierviewrepository</code>
     */
    public static final Supplierviewrepository SUPPLIERVIEWREPOSITORY = new Supplierviewrepository();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SupplierviewrepositoryRecord> getRecordType() {
        return SupplierviewrepositoryRecord.class;
    }

    /**
     * The column <code>inf.supplierviewrepository.id</code>.
     */
    public final TableField<SupplierviewrepositoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>inf.supplierviewrepository.name</code>.
     */
    public final TableField<SupplierviewrepositoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(61), this, "");

    /**
     * Create a <code>inf.supplierviewrepository</code> table reference
     */
    public Supplierviewrepository() {
        this("supplierviewrepository", null);
    }

    /**
     * Create an aliased <code>inf.supplierviewrepository</code> table reference
     */
    public Supplierviewrepository(String alias) {
        this(alias, SUPPLIERVIEWREPOSITORY);
    }

    private Supplierviewrepository(String alias, Table<SupplierviewrepositoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Supplierviewrepository(String alias, Table<SupplierviewrepositoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
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
    public Supplierviewrepository as(String alias) {
        return new Supplierviewrepository(alias, this);
    }

    /**
     * Rename this table
     */
    public Supplierviewrepository rename(String name) {
        return new Supplierviewrepository(name, null);
    }
}
