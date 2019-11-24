/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model.tables;


import com.infsystem.infsystem.databse.jooq.model.Inf;
import com.infsystem.infsystem.databse.jooq.model.Keys;
import com.infsystem.infsystem.databse.jooq.model.tables.records.TaskTypeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class TaskType extends TableImpl<TaskTypeRecord> {

    private static final long serialVersionUID = 188081012;

    /**
     * The reference instance of <code>inf.task_type</code>
     */
    public static final TaskType TASK_TYPE = new TaskType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskTypeRecord> getRecordType() {
        return TaskTypeRecord.class;
    }

    /**
     * The column <code>inf.task_type.id</code>.
     */
    public final TableField<TaskTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.task_type.name</code>.
     */
    public final TableField<TaskTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * Create a <code>inf.task_type</code> table reference
     */
    public TaskType() {
        this("task_type", null);
    }

    /**
     * Create an aliased <code>inf.task_type</code> table reference
     */
    public TaskType(String alias) {
        this(alias, TASK_TYPE);
    }

    private TaskType(String alias, Table<TaskTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskType(String alias, Table<TaskTypeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TaskTypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TASK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TaskTypeRecord> getPrimaryKey() {
        return Keys.KEY_TASK_TYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TaskTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<TaskTypeRecord>>asList(Keys.KEY_TASK_TYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskType as(String alias) {
        return new TaskType(alias, this);
    }

    /**
     * Rename this table
     */
    public TaskType rename(String name) {
        return new TaskType(name, null);
    }
}
