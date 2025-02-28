/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model.tables;


import com.infsystem.infsystem.databse.jooq.model.Inf;
import com.infsystem.infsystem.databse.jooq.model.Keys;
import com.infsystem.infsystem.databse.jooq.model.tables.records.JobTaskVendorRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class JobTaskVendor extends TableImpl<JobTaskVendorRecord> {

    private static final long serialVersionUID = -933949300;

    /**
     * The reference instance of <code>inf.job_task_vendor</code>
     */
    public static final JobTaskVendor JOB_TASK_VENDOR = new JobTaskVendor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobTaskVendorRecord> getRecordType() {
        return JobTaskVendorRecord.class;
    }

    /**
     * The column <code>inf.job_task_vendor.taskId</code>.
     */
    public final TableField<JobTaskVendorRecord, Integer> TASKID = createField("taskId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.job_task_vendor.vendorId</code>.
     */
    public final TableField<JobTaskVendorRecord, Integer> VENDORID = createField("vendorId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>inf.job_task_vendor.quantityGiven</code>.
     */
    public final TableField<JobTaskVendorRecord, Integer> QUANTITYGIVEN = createField("quantityGiven", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>inf.job_task_vendor.initDate</code>.
     */
    public final TableField<JobTaskVendorRecord, Date> INITDATE = createField("initDate", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>inf.job_task_vendor.finished</code>.
     */
    public final TableField<JobTaskVendorRecord, Date> FINISHED = createField("finished", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>inf.job_task_vendor.expectedFinished</code>.
     */
    public final TableField<JobTaskVendorRecord, Date> EXPECTEDFINISHED = createField("expectedFinished", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>inf.job_task_vendor</code> table reference
     */
    public JobTaskVendor() {
        this("job_task_vendor", null);
    }

    /**
     * Create an aliased <code>inf.job_task_vendor</code> table reference
     */
    public JobTaskVendor(String alias) {
        this(alias, JOB_TASK_VENDOR);
    }

    private JobTaskVendor(String alias, Table<JobTaskVendorRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobTaskVendor(String alias, Table<JobTaskVendorRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<JobTaskVendorRecord> getPrimaryKey() {
        return Keys.KEY_JOB_TASK_VENDOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobTaskVendorRecord>> getKeys() {
        return Arrays.<UniqueKey<JobTaskVendorRecord>>asList(Keys.KEY_JOB_TASK_VENDOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JobTaskVendorRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JobTaskVendorRecord, ?>>asList(Keys.FK_JOBTASKVENDOR_JOBTASK, Keys.FK_JOBTASKVENDOR_PERSON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobTaskVendor as(String alias) {
        return new JobTaskVendor(alias, this);
    }

    /**
     * Rename this table
     */
    public JobTaskVendor rename(String name) {
        return new JobTaskVendor(name, null);
    }
}
