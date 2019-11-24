/**
 * This class is generated by jOOQ
 */
package com.infsystem.infsystem.databse.jooq.model;


import com.infsystem.infsystem.databse.jooq.model.tables.Address;
import com.infsystem.infsystem.databse.jooq.model.tables.Addresstype;
import com.infsystem.infsystem.databse.jooq.model.tables.Book;
import com.infsystem.infsystem.databse.jooq.model.tables.BookMedium;
import com.infsystem.infsystem.databse.jooq.model.tables.Chapter;
import com.infsystem.infsystem.databse.jooq.model.tables.Grade;
import com.infsystem.infsystem.databse.jooq.model.tables.Job;
import com.infsystem.infsystem.databse.jooq.model.tables.JobTask;
import com.infsystem.infsystem.databse.jooq.model.tables.JobTaskVendor;
import com.infsystem.infsystem.databse.jooq.model.tables.Material;
import com.infsystem.infsystem.databse.jooq.model.tables.MaterialCategory;
import com.infsystem.infsystem.databse.jooq.model.tables.MaterialSuplier;
import com.infsystem.infsystem.databse.jooq.model.tables.Orders;
import com.infsystem.infsystem.databse.jooq.model.tables.Pages;
import com.infsystem.infsystem.databse.jooq.model.tables.Person;
import com.infsystem.infsystem.databse.jooq.model.tables.Persontype;
import com.infsystem.infsystem.databse.jooq.model.tables.State;
import com.infsystem.infsystem.databse.jooq.model.tables.Supplierviewrepository;
import com.infsystem.infsystem.databse.jooq.model.tables.TaskExicuteMethod;
import com.infsystem.infsystem.databse.jooq.model.tables.TaskState;
import com.infsystem.infsystem.databse.jooq.model.tables.TaskType;
import com.infsystem.infsystem.databse.jooq.model.tables.Teliphone;
import com.infsystem.infsystem.databse.jooq.model.tables.User;
import com.infsystem.infsystem.databse.jooq.model.tables.UserType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Inf extends SchemaImpl {

    private static final long serialVersionUID = -743120422;

    /**
     * The reference instance of <code>inf</code>
     */
    public static final Inf INF = new Inf();

    /**
     * The table <code>inf.address</code>.
     */
    public final Address ADDRESS = com.infsystem.infsystem.databse.jooq.model.tables.Address.ADDRESS;

    /**
     * The table <code>inf.addresstype</code>.
     */
    public final Addresstype ADDRESSTYPE = com.infsystem.infsystem.databse.jooq.model.tables.Addresstype.ADDRESSTYPE;

    /**
     * The table <code>inf.book</code>.
     */
    public final Book BOOK = com.infsystem.infsystem.databse.jooq.model.tables.Book.BOOK;

    /**
     * The table <code>inf.book_medium</code>.
     */
    public final BookMedium BOOK_MEDIUM = com.infsystem.infsystem.databse.jooq.model.tables.BookMedium.BOOK_MEDIUM;

    /**
     * The table <code>inf.chapter</code>.
     */
    public final Chapter CHAPTER = com.infsystem.infsystem.databse.jooq.model.tables.Chapter.CHAPTER;

    /**
     * The table <code>inf.grade</code>.
     */
    public final Grade GRADE = com.infsystem.infsystem.databse.jooq.model.tables.Grade.GRADE;

    /**
     * The table <code>inf.job</code>.
     */
    public final Job JOB = com.infsystem.infsystem.databse.jooq.model.tables.Job.JOB;

    /**
     * The table <code>inf.job_task</code>.
     */
    public final JobTask JOB_TASK = com.infsystem.infsystem.databse.jooq.model.tables.JobTask.JOB_TASK;

    /**
     * The table <code>inf.job_task_vendor</code>.
     */
    public final JobTaskVendor JOB_TASK_VENDOR = com.infsystem.infsystem.databse.jooq.model.tables.JobTaskVendor.JOB_TASK_VENDOR;

    /**
     * The table <code>inf.material</code>.
     */
    public final Material MATERIAL = com.infsystem.infsystem.databse.jooq.model.tables.Material.MATERIAL;

    /**
     * The table <code>inf.material_category</code>.
     */
    public final MaterialCategory MATERIAL_CATEGORY = com.infsystem.infsystem.databse.jooq.model.tables.MaterialCategory.MATERIAL_CATEGORY;

    /**
     * The table <code>inf.material_suplier</code>.
     */
    public final MaterialSuplier MATERIAL_SUPLIER = com.infsystem.infsystem.databse.jooq.model.tables.MaterialSuplier.MATERIAL_SUPLIER;

    /**
     * The table <code>inf.orders</code>.
     */
    public final Orders ORDERS = com.infsystem.infsystem.databse.jooq.model.tables.Orders.ORDERS;

    /**
     * The table <code>inf.pages</code>.
     */
    public final Pages PAGES = com.infsystem.infsystem.databse.jooq.model.tables.Pages.PAGES;

    /**
     * The table <code>inf.person</code>.
     */
    public final Person PERSON = com.infsystem.infsystem.databse.jooq.model.tables.Person.PERSON;

    /**
     * The table <code>inf.persontype</code>.
     */
    public final Persontype PERSONTYPE = com.infsystem.infsystem.databse.jooq.model.tables.Persontype.PERSONTYPE;

    /**
     * The table <code>inf.state</code>.
     */
    public final State STATE = com.infsystem.infsystem.databse.jooq.model.tables.State.STATE;

    /**
     * VIEW
     */
    public final Supplierviewrepository SUPPLIERVIEWREPOSITORY = com.infsystem.infsystem.databse.jooq.model.tables.Supplierviewrepository.SUPPLIERVIEWREPOSITORY;

    /**
     * The table <code>inf.task_exicute_method</code>.
     */
    public final TaskExicuteMethod TASK_EXICUTE_METHOD = com.infsystem.infsystem.databse.jooq.model.tables.TaskExicuteMethod.TASK_EXICUTE_METHOD;

    /**
     * The table <code>inf.task_state</code>.
     */
    public final TaskState TASK_STATE = com.infsystem.infsystem.databse.jooq.model.tables.TaskState.TASK_STATE;

    /**
     * The table <code>inf.task_type</code>.
     */
    public final TaskType TASK_TYPE = com.infsystem.infsystem.databse.jooq.model.tables.TaskType.TASK_TYPE;

    /**
     * The table <code>inf.teliphone</code>.
     */
    public final Teliphone TELIPHONE = com.infsystem.infsystem.databse.jooq.model.tables.Teliphone.TELIPHONE;

    /**
     * The table <code>inf.user</code>.
     */
    public final User USER = com.infsystem.infsystem.databse.jooq.model.tables.User.USER;

    /**
     * The table <code>inf.user_type</code>.
     */
    public final UserType USER_TYPE = com.infsystem.infsystem.databse.jooq.model.tables.UserType.USER_TYPE;

    /**
     * No further instances allowed
     */
    private Inf() {
        super("inf", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Address.ADDRESS,
            Addresstype.ADDRESSTYPE,
            Book.BOOK,
            BookMedium.BOOK_MEDIUM,
            Chapter.CHAPTER,
            Grade.GRADE,
            Job.JOB,
            JobTask.JOB_TASK,
            JobTaskVendor.JOB_TASK_VENDOR,
            Material.MATERIAL,
            MaterialCategory.MATERIAL_CATEGORY,
            MaterialSuplier.MATERIAL_SUPLIER,
            Orders.ORDERS,
            Pages.PAGES,
            Person.PERSON,
            Persontype.PERSONTYPE,
            State.STATE,
            Supplierviewrepository.SUPPLIERVIEWREPOSITORY,
            TaskExicuteMethod.TASK_EXICUTE_METHOD,
            TaskState.TASK_STATE,
            TaskType.TASK_TYPE,
            Teliphone.TELIPHONE,
            User.USER,
            UserType.USER_TYPE);
    }
}
