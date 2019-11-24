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
import com.infsystem.infsystem.databse.jooq.model.tables.TaskExicuteMethod;
import com.infsystem.infsystem.databse.jooq.model.tables.TaskState;
import com.infsystem.infsystem.databse.jooq.model.tables.TaskType;
import com.infsystem.infsystem.databse.jooq.model.tables.Teliphone;
import com.infsystem.infsystem.databse.jooq.model.tables.User;
import com.infsystem.infsystem.databse.jooq.model.tables.UserType;
import com.infsystem.infsystem.databse.jooq.model.tables.records.AddressRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.AddresstypeRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.BookMediumRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.BookRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.ChapterRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.GradeRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.JobRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.JobTaskRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.JobTaskVendorRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.MaterialCategoryRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.MaterialRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.MaterialSuplierRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.OrdersRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.PagesRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.PersonRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.PersontypeRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.StateRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.TaskExicuteMethodRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.TaskStateRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.TaskTypeRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.TeliphoneRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.UserRecord;
import com.infsystem.infsystem.databse.jooq.model.tables.records.UserTypeRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>inf</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AddressRecord, Integer> IDENTITY_ADDRESS = Identities0.IDENTITY_ADDRESS;
    public static final Identity<AddresstypeRecord, Integer> IDENTITY_ADDRESSTYPE = Identities0.IDENTITY_ADDRESSTYPE;
    public static final Identity<BookRecord, Integer> IDENTITY_BOOK = Identities0.IDENTITY_BOOK;
    public static final Identity<BookMediumRecord, Integer> IDENTITY_BOOK_MEDIUM = Identities0.IDENTITY_BOOK_MEDIUM;
    public static final Identity<ChapterRecord, Integer> IDENTITY_CHAPTER = Identities0.IDENTITY_CHAPTER;
    public static final Identity<GradeRecord, Integer> IDENTITY_GRADE = Identities0.IDENTITY_GRADE;
    public static final Identity<JobRecord, Integer> IDENTITY_JOB = Identities0.IDENTITY_JOB;
    public static final Identity<JobTaskRecord, Integer> IDENTITY_JOB_TASK = Identities0.IDENTITY_JOB_TASK;
    public static final Identity<MaterialRecord, Integer> IDENTITY_MATERIAL = Identities0.IDENTITY_MATERIAL;
    public static final Identity<MaterialCategoryRecord, Integer> IDENTITY_MATERIAL_CATEGORY = Identities0.IDENTITY_MATERIAL_CATEGORY;
    public static final Identity<OrdersRecord, Integer> IDENTITY_ORDERS = Identities0.IDENTITY_ORDERS;
    public static final Identity<PagesRecord, Integer> IDENTITY_PAGES = Identities0.IDENTITY_PAGES;
    public static final Identity<PersonRecord, Integer> IDENTITY_PERSON = Identities0.IDENTITY_PERSON;
    public static final Identity<PersontypeRecord, Integer> IDENTITY_PERSONTYPE = Identities0.IDENTITY_PERSONTYPE;
    public static final Identity<StateRecord, Integer> IDENTITY_STATE = Identities0.IDENTITY_STATE;
    public static final Identity<TaskExicuteMethodRecord, Integer> IDENTITY_TASK_EXICUTE_METHOD = Identities0.IDENTITY_TASK_EXICUTE_METHOD;
    public static final Identity<TaskStateRecord, Integer> IDENTITY_TASK_STATE = Identities0.IDENTITY_TASK_STATE;
    public static final Identity<TaskTypeRecord, Integer> IDENTITY_TASK_TYPE = Identities0.IDENTITY_TASK_TYPE;
    public static final Identity<UserTypeRecord, Integer> IDENTITY_USER_TYPE = Identities0.IDENTITY_USER_TYPE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = UniqueKeys0.KEY_ADDRESS_PRIMARY;
    public static final UniqueKey<AddresstypeRecord> KEY_ADDRESSTYPE_PRIMARY = UniqueKeys0.KEY_ADDRESSTYPE_PRIMARY;
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<BookMediumRecord> KEY_BOOK_MEDIUM_PRIMARY = UniqueKeys0.KEY_BOOK_MEDIUM_PRIMARY;
    public static final UniqueKey<ChapterRecord> KEY_CHAPTER_PRIMARY = UniqueKeys0.KEY_CHAPTER_PRIMARY;
    public static final UniqueKey<GradeRecord> KEY_GRADE_PRIMARY = UniqueKeys0.KEY_GRADE_PRIMARY;
    public static final UniqueKey<JobRecord> KEY_JOB_PRIMARY = UniqueKeys0.KEY_JOB_PRIMARY;
    public static final UniqueKey<JobTaskRecord> KEY_JOB_TASK_PRIMARY = UniqueKeys0.KEY_JOB_TASK_PRIMARY;
    public static final UniqueKey<JobTaskVendorRecord> KEY_JOB_TASK_VENDOR_PRIMARY = UniqueKeys0.KEY_JOB_TASK_VENDOR_PRIMARY;
    public static final UniqueKey<MaterialRecord> KEY_MATERIAL_PRIMARY = UniqueKeys0.KEY_MATERIAL_PRIMARY;
    public static final UniqueKey<MaterialCategoryRecord> KEY_MATERIAL_CATEGORY_PRIMARY = UniqueKeys0.KEY_MATERIAL_CATEGORY_PRIMARY;
    public static final UniqueKey<MaterialSuplierRecord> KEY_MATERIAL_SUPLIER_PRIMARY = UniqueKeys0.KEY_MATERIAL_SUPLIER_PRIMARY;
    public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = UniqueKeys0.KEY_ORDERS_PRIMARY;
    public static final UniqueKey<PagesRecord> KEY_PAGES_PRIMARY = UniqueKeys0.KEY_PAGES_PRIMARY;
    public static final UniqueKey<PersonRecord> KEY_PERSON_PRIMARY = UniqueKeys0.KEY_PERSON_PRIMARY;
    public static final UniqueKey<PersonRecord> KEY_PERSON_EMAIL = UniqueKeys0.KEY_PERSON_EMAIL;
    public static final UniqueKey<PersontypeRecord> KEY_PERSONTYPE_PRIMARY = UniqueKeys0.KEY_PERSONTYPE_PRIMARY;
    public static final UniqueKey<StateRecord> KEY_STATE_PRIMARY = UniqueKeys0.KEY_STATE_PRIMARY;
    public static final UniqueKey<TaskExicuteMethodRecord> KEY_TASK_EXICUTE_METHOD_PRIMARY = UniqueKeys0.KEY_TASK_EXICUTE_METHOD_PRIMARY;
    public static final UniqueKey<TaskStateRecord> KEY_TASK_STATE_PRIMARY = UniqueKeys0.KEY_TASK_STATE_PRIMARY;
    public static final UniqueKey<TaskTypeRecord> KEY_TASK_TYPE_PRIMARY = UniqueKeys0.KEY_TASK_TYPE_PRIMARY;
    public static final UniqueKey<TeliphoneRecord> KEY_TELIPHONE_PRIMARY = UniqueKeys0.KEY_TELIPHONE_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_ID = UniqueKeys0.KEY_USER_ID;
    public static final UniqueKey<UserRecord> KEY_USER_USERNAME = UniqueKeys0.KEY_USER_USERNAME;
    public static final UniqueKey<UserTypeRecord> KEY_USER_TYPE_PRIMARY = UniqueKeys0.KEY_USER_TYPE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AddressRecord, PersonRecord> FK_ADDRESS_PERSON = ForeignKeys0.FK_ADDRESS_PERSON;
    public static final ForeignKey<AddressRecord, AddresstypeRecord> FK_ADDRESS_ADDRESSTYPE = ForeignKeys0.FK_ADDRESS_ADDRESSTYPE;
    public static final ForeignKey<BookRecord, BookMediumRecord> FK_BOOK_MEDIUM = ForeignKeys0.FK_BOOK_MEDIUM;
    public static final ForeignKey<BookRecord, GradeRecord> FK_GRADE = ForeignKeys0.FK_GRADE;
    public static final ForeignKey<BookRecord, StateRecord> FK_BOOK_STATE = ForeignKeys0.FK_BOOK_STATE;
    public static final ForeignKey<ChapterRecord, BookRecord> FK_CHAPTER_BOOK = ForeignKeys0.FK_CHAPTER_BOOK;
    public static final ForeignKey<JobRecord, OrdersRecord> FK_JOB_ORDER = ForeignKeys0.FK_JOB_ORDER;
    public static final ForeignKey<JobRecord, PersonRecord> FK_JOB_PERSON_CREATEBY = ForeignKeys0.FK_JOB_PERSON_CREATEBY;
    public static final ForeignKey<JobRecord, PersonRecord> FK_JOB_PERSON_MODIFYBY = ForeignKeys0.FK_JOB_PERSON_MODIFYBY;
    public static final ForeignKey<JobRecord, TaskStateRecord> FK_JOB_ODERSTATE = ForeignKeys0.FK_JOB_ODERSTATE;
    public static final ForeignKey<JobTaskRecord, JobRecord> FK_JOBTASK_JOB = ForeignKeys0.FK_JOBTASK_JOB;
    public static final ForeignKey<JobTaskRecord, TaskStateRecord> FK_JOBTASK_TASKSTATE = ForeignKeys0.FK_JOBTASK_TASKSTATE;
    public static final ForeignKey<JobTaskRecord, TaskExicuteMethodRecord> FK_JOBTASK_TASKEXICUTEMETHOD = ForeignKeys0.FK_JOBTASK_TASKEXICUTEMETHOD;
    public static final ForeignKey<JobTaskRecord, TaskExicuteMethodRecord> FK_JOBTASK_TASKTYPE = ForeignKeys0.FK_JOBTASK_TASKTYPE;
    public static final ForeignKey<JobTaskRecord, PersonRecord> FK_JOBTASK_PERSON_CREATEBY = ForeignKeys0.FK_JOBTASK_PERSON_CREATEBY;
    public static final ForeignKey<JobTaskRecord, PersonRecord> FK_JOBTASK_PERSON_MODIFYBY = ForeignKeys0.FK_JOBTASK_PERSON_MODIFYBY;
    public static final ForeignKey<JobTaskVendorRecord, JobTaskRecord> FK_JOBTASKVENDOR_JOBTASK = ForeignKeys0.FK_JOBTASKVENDOR_JOBTASK;
    public static final ForeignKey<JobTaskVendorRecord, PersonRecord> FK_JOBTASKVENDOR_PERSON = ForeignKeys0.FK_JOBTASKVENDOR_PERSON;
    public static final ForeignKey<MaterialRecord, MaterialCategoryRecord> PK_MATERIAL_MATERIALCATOGORY = ForeignKeys0.PK_MATERIAL_MATERIALCATOGORY;
    public static final ForeignKey<MaterialSuplierRecord, PersonRecord> PK_MATERIALSUPLIER_PERSON = ForeignKeys0.PK_MATERIALSUPLIER_PERSON;
    public static final ForeignKey<MaterialSuplierRecord, PersonRecord> PK_MATERIALSUPLIER_MATERIAL = ForeignKeys0.PK_MATERIALSUPLIER_MATERIAL;
    public static final ForeignKey<OrdersRecord, PersonRecord> FK_ORDER_PERSON_CREATEBY = ForeignKeys0.FK_ORDER_PERSON_CREATEBY;
    public static final ForeignKey<OrdersRecord, PersonRecord> FK_ORDER_PERSON_MODIFYBY = ForeignKeys0.FK_ORDER_PERSON_MODIFYBY;
    public static final ForeignKey<OrdersRecord, PersonRecord> FK_ORDER_PERSON_CLIENT = ForeignKeys0.FK_ORDER_PERSON_CLIENT;
    public static final ForeignKey<OrdersRecord, StateRecord> FK_ORDER_ODERSTATE = ForeignKeys0.FK_ORDER_ODERSTATE;
    public static final ForeignKey<PagesRecord, ChapterRecord> FK_PAGE_CHAPTER = ForeignKeys0.FK_PAGE_CHAPTER;
    public static final ForeignKey<PersonRecord, PersonRecord> FK_PERSON_PERSONADDBY = ForeignKeys0.FK_PERSON_PERSONADDBY;
    public static final ForeignKey<PersonRecord, PersonRecord> FK_PERSON_PERSONMODIFYBY = ForeignKeys0.FK_PERSON_PERSONMODIFYBY;
    public static final ForeignKey<PersonRecord, PersontypeRecord> FK_PERSON_PERSONTYPE = ForeignKeys0.FK_PERSON_PERSONTYPE;
    public static final ForeignKey<PersonRecord, StateRecord> FK_PERSON_PERSONSTATUS = ForeignKeys0.FK_PERSON_PERSONSTATUS;
    public static final ForeignKey<TeliphoneRecord, PersonRecord> FK_TELIPHONE_PERSON = ForeignKeys0.FK_TELIPHONE_PERSON;
    public static final ForeignKey<UserRecord, PersonRecord> FK_USER = ForeignKeys0.FK_USER;
    public static final ForeignKey<UserRecord, UserTypeRecord> FK_USER_USERTYPE = ForeignKeys0.FK_USER_USERTYPE;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AddressRecord, Integer> IDENTITY_ADDRESS = createIdentity(Address.ADDRESS, Address.ADDRESS.ID);
        public static Identity<AddresstypeRecord, Integer> IDENTITY_ADDRESSTYPE = createIdentity(Addresstype.ADDRESSTYPE, Addresstype.ADDRESSTYPE.ID);
        public static Identity<BookRecord, Integer> IDENTITY_BOOK = createIdentity(Book.BOOK, Book.BOOK.ID);
        public static Identity<BookMediumRecord, Integer> IDENTITY_BOOK_MEDIUM = createIdentity(BookMedium.BOOK_MEDIUM, BookMedium.BOOK_MEDIUM.ID);
        public static Identity<ChapterRecord, Integer> IDENTITY_CHAPTER = createIdentity(Chapter.CHAPTER, Chapter.CHAPTER.ID);
        public static Identity<GradeRecord, Integer> IDENTITY_GRADE = createIdentity(Grade.GRADE, Grade.GRADE.ID);
        public static Identity<JobRecord, Integer> IDENTITY_JOB = createIdentity(Job.JOB, Job.JOB.ID);
        public static Identity<JobTaskRecord, Integer> IDENTITY_JOB_TASK = createIdentity(JobTask.JOB_TASK, JobTask.JOB_TASK.ID);
        public static Identity<MaterialRecord, Integer> IDENTITY_MATERIAL = createIdentity(Material.MATERIAL, Material.MATERIAL.ID);
        public static Identity<MaterialCategoryRecord, Integer> IDENTITY_MATERIAL_CATEGORY = createIdentity(MaterialCategory.MATERIAL_CATEGORY, MaterialCategory.MATERIAL_CATEGORY.ID);
        public static Identity<OrdersRecord, Integer> IDENTITY_ORDERS = createIdentity(Orders.ORDERS, Orders.ORDERS.ID);
        public static Identity<PagesRecord, Integer> IDENTITY_PAGES = createIdentity(Pages.PAGES, Pages.PAGES.ID);
        public static Identity<PersonRecord, Integer> IDENTITY_PERSON = createIdentity(Person.PERSON, Person.PERSON.ID);
        public static Identity<PersontypeRecord, Integer> IDENTITY_PERSONTYPE = createIdentity(Persontype.PERSONTYPE, Persontype.PERSONTYPE.ID);
        public static Identity<StateRecord, Integer> IDENTITY_STATE = createIdentity(State.STATE, State.STATE.ID);
        public static Identity<TaskExicuteMethodRecord, Integer> IDENTITY_TASK_EXICUTE_METHOD = createIdentity(TaskExicuteMethod.TASK_EXICUTE_METHOD, TaskExicuteMethod.TASK_EXICUTE_METHOD.ID);
        public static Identity<TaskStateRecord, Integer> IDENTITY_TASK_STATE = createIdentity(TaskState.TASK_STATE, TaskState.TASK_STATE.ID);
        public static Identity<TaskTypeRecord, Integer> IDENTITY_TASK_TYPE = createIdentity(TaskType.TASK_TYPE, TaskType.TASK_TYPE.ID);
        public static Identity<UserTypeRecord, Integer> IDENTITY_USER_TYPE = createIdentity(UserType.USER_TYPE, UserType.USER_TYPE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = createUniqueKey(Address.ADDRESS, "KEY_address_PRIMARY", Address.ADDRESS.ID);
        public static final UniqueKey<AddresstypeRecord> KEY_ADDRESSTYPE_PRIMARY = createUniqueKey(Addresstype.ADDRESSTYPE, "KEY_addresstype_PRIMARY", Addresstype.ADDRESSTYPE.ID);
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, "KEY_book_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<BookMediumRecord> KEY_BOOK_MEDIUM_PRIMARY = createUniqueKey(BookMedium.BOOK_MEDIUM, "KEY_book_medium_PRIMARY", BookMedium.BOOK_MEDIUM.ID);
        public static final UniqueKey<ChapterRecord> KEY_CHAPTER_PRIMARY = createUniqueKey(Chapter.CHAPTER, "KEY_chapter_PRIMARY", Chapter.CHAPTER.ID);
        public static final UniqueKey<GradeRecord> KEY_GRADE_PRIMARY = createUniqueKey(Grade.GRADE, "KEY_grade_PRIMARY", Grade.GRADE.ID);
        public static final UniqueKey<JobRecord> KEY_JOB_PRIMARY = createUniqueKey(Job.JOB, "KEY_job_PRIMARY", Job.JOB.ID);
        public static final UniqueKey<JobTaskRecord> KEY_JOB_TASK_PRIMARY = createUniqueKey(JobTask.JOB_TASK, "KEY_job_task_PRIMARY", JobTask.JOB_TASK.ID);
        public static final UniqueKey<JobTaskVendorRecord> KEY_JOB_TASK_VENDOR_PRIMARY = createUniqueKey(JobTaskVendor.JOB_TASK_VENDOR, "KEY_job_task_vendor_PRIMARY", JobTaskVendor.JOB_TASK_VENDOR.TASKID, JobTaskVendor.JOB_TASK_VENDOR.VENDORID);
        public static final UniqueKey<MaterialRecord> KEY_MATERIAL_PRIMARY = createUniqueKey(Material.MATERIAL, "KEY_material_PRIMARY", Material.MATERIAL.ID);
        public static final UniqueKey<MaterialCategoryRecord> KEY_MATERIAL_CATEGORY_PRIMARY = createUniqueKey(MaterialCategory.MATERIAL_CATEGORY, "KEY_material_category_PRIMARY", MaterialCategory.MATERIAL_CATEGORY.ID);
        public static final UniqueKey<MaterialSuplierRecord> KEY_MATERIAL_SUPLIER_PRIMARY = createUniqueKey(MaterialSuplier.MATERIAL_SUPLIER, "KEY_material_suplier_PRIMARY", MaterialSuplier.MATERIAL_SUPLIER.SUPLIERID, MaterialSuplier.MATERIAL_SUPLIER.MATERIALID);
        public static final UniqueKey<OrdersRecord> KEY_ORDERS_PRIMARY = createUniqueKey(Orders.ORDERS, "KEY_orders_PRIMARY", Orders.ORDERS.ID);
        public static final UniqueKey<PagesRecord> KEY_PAGES_PRIMARY = createUniqueKey(Pages.PAGES, "KEY_pages_PRIMARY", Pages.PAGES.ID);
        public static final UniqueKey<PersonRecord> KEY_PERSON_PRIMARY = createUniqueKey(Person.PERSON, "KEY_person_PRIMARY", Person.PERSON.ID);
        public static final UniqueKey<PersonRecord> KEY_PERSON_EMAIL = createUniqueKey(Person.PERSON, "KEY_person_email", Person.PERSON.EMAIL);
        public static final UniqueKey<PersontypeRecord> KEY_PERSONTYPE_PRIMARY = createUniqueKey(Persontype.PERSONTYPE, "KEY_persontype_PRIMARY", Persontype.PERSONTYPE.ID);
        public static final UniqueKey<StateRecord> KEY_STATE_PRIMARY = createUniqueKey(State.STATE, "KEY_state_PRIMARY", State.STATE.ID);
        public static final UniqueKey<TaskExicuteMethodRecord> KEY_TASK_EXICUTE_METHOD_PRIMARY = createUniqueKey(TaskExicuteMethod.TASK_EXICUTE_METHOD, "KEY_task_exicute_method_PRIMARY", TaskExicuteMethod.TASK_EXICUTE_METHOD.ID);
        public static final UniqueKey<TaskStateRecord> KEY_TASK_STATE_PRIMARY = createUniqueKey(TaskState.TASK_STATE, "KEY_task_state_PRIMARY", TaskState.TASK_STATE.ID);
        public static final UniqueKey<TaskTypeRecord> KEY_TASK_TYPE_PRIMARY = createUniqueKey(TaskType.TASK_TYPE, "KEY_task_type_PRIMARY", TaskType.TASK_TYPE.ID);
        public static final UniqueKey<TeliphoneRecord> KEY_TELIPHONE_PRIMARY = createUniqueKey(Teliphone.TELIPHONE, "KEY_teliphone_PRIMARY", Teliphone.TELIPHONE.ID, Teliphone.TELIPHONE.NUMBER);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID, User.USER.TYPE);
        public static final UniqueKey<UserRecord> KEY_USER_ID = createUniqueKey(User.USER, "KEY_user_id", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_USERNAME = createUniqueKey(User.USER, "KEY_user_username", User.USER.USERNAME);
        public static final UniqueKey<UserTypeRecord> KEY_USER_TYPE_PRIMARY = createUniqueKey(UserType.USER_TYPE, "KEY_user_type_PRIMARY", UserType.USER_TYPE.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AddressRecord, PersonRecord> FK_ADDRESS_PERSON = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Address.ADDRESS, "fk_address_person", Address.ADDRESS.USERID);
        public static final ForeignKey<AddressRecord, AddresstypeRecord> FK_ADDRESS_ADDRESSTYPE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_ADDRESSTYPE_PRIMARY, Address.ADDRESS, "fk_address_addressType", Address.ADDRESS.TYPE);
        public static final ForeignKey<BookRecord, BookMediumRecord> FK_BOOK_MEDIUM = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_BOOK_MEDIUM_PRIMARY, Book.BOOK, "fk_book_medium", Book.BOOK.MEDIUM);
        public static final ForeignKey<BookRecord, GradeRecord> FK_GRADE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_GRADE_PRIMARY, Book.BOOK, "fk_grade", Book.BOOK.GRADE);
        public static final ForeignKey<BookRecord, StateRecord> FK_BOOK_STATE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_STATE_PRIMARY, Book.BOOK, "fk_book_state", Book.BOOK.STATUS);
        public static final ForeignKey<ChapterRecord, BookRecord> FK_CHAPTER_BOOK = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_BOOK_PRIMARY, Chapter.CHAPTER, "fk_chapter_book", Chapter.CHAPTER.BOOKID);
        public static final ForeignKey<JobRecord, OrdersRecord> FK_JOB_ORDER = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_ORDERS_PRIMARY, Job.JOB, "fk_job_order", Job.JOB.ORDERID);
        public static final ForeignKey<JobRecord, PersonRecord> FK_JOB_PERSON_CREATEBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Job.JOB, "fk_job_person_createBy", Job.JOB.CREATEBY);
        public static final ForeignKey<JobRecord, PersonRecord> FK_JOB_PERSON_MODIFYBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Job.JOB, "fk_job_person_ModifyBy", Job.JOB.MODIFYBY);
        public static final ForeignKey<JobRecord, TaskStateRecord> FK_JOB_ODERSTATE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_TASK_STATE_PRIMARY, Job.JOB, "fk_job_oderState", Job.JOB.STATE);
        public static final ForeignKey<JobTaskRecord, JobRecord> FK_JOBTASK_JOB = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_JOB_PRIMARY, JobTask.JOB_TASK, "fk_jobTask_job", JobTask.JOB_TASK.JOBID);
        public static final ForeignKey<JobTaskRecord, TaskStateRecord> FK_JOBTASK_TASKSTATE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_TASK_STATE_PRIMARY, JobTask.JOB_TASK, "fk_jobTask_taskState", JobTask.JOB_TASK.STATE);
        public static final ForeignKey<JobTaskRecord, TaskExicuteMethodRecord> FK_JOBTASK_TASKEXICUTEMETHOD = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_TASK_EXICUTE_METHOD_PRIMARY, JobTask.JOB_TASK, "fk_jobTask_taskExicuteMethod", JobTask.JOB_TASK.TASKEXICUTEMETHOD);
        public static final ForeignKey<JobTaskRecord, TaskExicuteMethodRecord> FK_JOBTASK_TASKTYPE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_TASK_EXICUTE_METHOD_PRIMARY, JobTask.JOB_TASK, "fk_jobTask_taskType", JobTask.JOB_TASK.TASKEXICUTEMETHOD);
        public static final ForeignKey<JobTaskRecord, PersonRecord> FK_JOBTASK_PERSON_CREATEBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, JobTask.JOB_TASK, "fk_jobTask_person_createBy", JobTask.JOB_TASK.CREATEBY);
        public static final ForeignKey<JobTaskRecord, PersonRecord> FK_JOBTASK_PERSON_MODIFYBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, JobTask.JOB_TASK, "fk_jobTask_person_ModifyBy", JobTask.JOB_TASK.MODIFYBY);
        public static final ForeignKey<JobTaskVendorRecord, JobTaskRecord> FK_JOBTASKVENDOR_JOBTASK = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_JOB_TASK_PRIMARY, JobTaskVendor.JOB_TASK_VENDOR, "fk_jobTaskVendor_JobTask", JobTaskVendor.JOB_TASK_VENDOR.TASKID);
        public static final ForeignKey<JobTaskVendorRecord, PersonRecord> FK_JOBTASKVENDOR_PERSON = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, JobTaskVendor.JOB_TASK_VENDOR, "fk_jobTaskVendor_person", JobTaskVendor.JOB_TASK_VENDOR.VENDORID);
        public static final ForeignKey<MaterialRecord, MaterialCategoryRecord> PK_MATERIAL_MATERIALCATOGORY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_MATERIAL_CATEGORY_PRIMARY, Material.MATERIAL, "pk_material_materialCatogory", Material.MATERIAL.CATEGORYID);
        public static final ForeignKey<MaterialSuplierRecord, PersonRecord> PK_MATERIALSUPLIER_PERSON = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, MaterialSuplier.MATERIAL_SUPLIER, "pk_materialSuplier_person", MaterialSuplier.MATERIAL_SUPLIER.SUPLIERID);
        public static final ForeignKey<MaterialSuplierRecord, PersonRecord> PK_MATERIALSUPLIER_MATERIAL = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, MaterialSuplier.MATERIAL_SUPLIER, "pk_materialSuplier_material", MaterialSuplier.MATERIAL_SUPLIER.MATERIALID);
        public static final ForeignKey<OrdersRecord, PersonRecord> FK_ORDER_PERSON_CREATEBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Orders.ORDERS, "fk_order_person_createBy", Orders.ORDERS.CREATEBY);
        public static final ForeignKey<OrdersRecord, PersonRecord> FK_ORDER_PERSON_MODIFYBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Orders.ORDERS, "fk_order_person_ModifyBy", Orders.ORDERS.MODIFYBY);
        public static final ForeignKey<OrdersRecord, PersonRecord> FK_ORDER_PERSON_CLIENT = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Orders.ORDERS, "fk_order_person_Client", Orders.ORDERS.CLIENT);
        public static final ForeignKey<OrdersRecord, StateRecord> FK_ORDER_ODERSTATE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_STATE_PRIMARY, Orders.ORDERS, "fk_order_oderState", Orders.ORDERS.STATE);
        public static final ForeignKey<PagesRecord, ChapterRecord> FK_PAGE_CHAPTER = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_CHAPTER_PRIMARY, Pages.PAGES, "fk_page_chapter", Pages.PAGES.CHAPTERID);
        public static final ForeignKey<PersonRecord, PersonRecord> FK_PERSON_PERSONADDBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Person.PERSON, "fk_person_personaddBy", Person.PERSON.ADDBY);
        public static final ForeignKey<PersonRecord, PersonRecord> FK_PERSON_PERSONMODIFYBY = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Person.PERSON, "fk_person_personModifyBy", Person.PERSON.MODIFYBY);
        public static final ForeignKey<PersonRecord, PersontypeRecord> FK_PERSON_PERSONTYPE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSONTYPE_PRIMARY, Person.PERSON, "fk_person_personType", Person.PERSON.TYPE);
        public static final ForeignKey<PersonRecord, StateRecord> FK_PERSON_PERSONSTATUS = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_STATE_PRIMARY, Person.PERSON, "fk_person_personStatus", Person.PERSON.STATUS);
        public static final ForeignKey<TeliphoneRecord, PersonRecord> FK_TELIPHONE_PERSON = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, Teliphone.TELIPHONE, "fk_teliphone_person", Teliphone.TELIPHONE.ID);
        public static final ForeignKey<UserRecord, PersonRecord> FK_USER = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_PERSON_PRIMARY, User.USER, "fk_user", User.USER.ID);
        public static final ForeignKey<UserRecord, UserTypeRecord> FK_USER_USERTYPE = createForeignKey(com.infsystem.infsystem.databse.jooq.model.Keys.KEY_USER_TYPE_PRIMARY, User.USER, "fk_user_userType", User.USER.TYPE);
    }
}
