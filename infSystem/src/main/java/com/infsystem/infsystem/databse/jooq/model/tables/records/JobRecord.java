/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model.tables.records;


import com.infsystem.infsystem.databse.jooq.model.tables.Job;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JobRecord extends UpdatableRecordImpl<JobRecord> implements Record11<Integer, Integer, Integer, Date, Integer, Date, Integer, Date, Date, Integer, Integer> {

    private static final long serialVersionUID = -2065259101;

    /**
     * Setter for <code>inf.job.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>inf.job.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>inf.job.productId</code>.
     */
    public void setProductid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>inf.job.productId</code>.
     */
    public Integer getProductid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>inf.job.orderId</code>.
     */
    public void setOrderid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>inf.job.orderId</code>.
     */
    public Integer getOrderid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>inf.job.createDate</code>.
     */
    public void setCreatedate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>inf.job.createDate</code>.
     */
    public Date getCreatedate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>inf.job.createBy</code>.
     */
    public void setCreateby(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>inf.job.createBy</code>.
     */
    public Integer getCreateby() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>inf.job.modifyDate</code>.
     */
    public void setModifydate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>inf.job.modifyDate</code>.
     */
    public Date getModifydate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>inf.job.modifyBy</code>.
     */
    public void setModifyby(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>inf.job.modifyBy</code>.
     */
    public Integer getModifyby() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>inf.job.startDate</code>.
     */
    public void setStartdate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>inf.job.startDate</code>.
     */
    public Date getStartdate() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>inf.job.endDate</code>.
     */
    public void setEnddate(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>inf.job.endDate</code>.
     */
    public Date getEnddate() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>inf.job.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>inf.job.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>inf.job.state</code>.
     */
    public void setState(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>inf.job.state</code>.
     */
    public Integer getState() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Date, Integer, Date, Integer, Date, Date, Integer, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Date, Integer, Date, Integer, Date, Date, Integer, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Job.JOB.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Job.JOB.PRODUCTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Job.JOB.ORDERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Job.JOB.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Job.JOB.CREATEBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Job.JOB.MODIFYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Job.JOB.MODIFYBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return Job.JOB.STARTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return Job.JOB.ENDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Job.JOB.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Job.JOB.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProductid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOrderid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCreateby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getModifydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getModifyby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getStartdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getEnddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value2(Integer value) {
        setProductid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value3(Integer value) {
        setOrderid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value4(Date value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value5(Integer value) {
        setCreateby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value6(Date value) {
        setModifydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value7(Integer value) {
        setModifyby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value8(Date value) {
        setStartdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value9(Date value) {
        setEnddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value10(Integer value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord value11(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobRecord values(Integer value1, Integer value2, Integer value3, Date value4, Integer value5, Date value6, Integer value7, Date value8, Date value9, Integer value10, Integer value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobRecord
     */
    public JobRecord() {
        super(Job.JOB);
    }

    /**
     * Create a detached, initialised JobRecord
     */
    public JobRecord(Integer id, Integer productid, Integer orderid, Date createdate, Integer createby, Date modifydate, Integer modifyby, Date startdate, Date enddate, Integer quantity, Integer state) {
        super(Job.JOB);

        set(0, id);
        set(1, productid);
        set(2, orderid);
        set(3, createdate);
        set(4, createby);
        set(5, modifydate);
        set(6, modifyby);
        set(7, startdate);
        set(8, enddate);
        set(9, quantity);
        set(10, state);
    }
}
