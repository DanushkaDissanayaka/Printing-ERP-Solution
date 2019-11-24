CREATE DATABASE inf;
use inf;

/**
* WHAT IS THE PERSON TYPE CLIENT , SUPPLIER OR OTHER
*/
CREATE  TABLE  personType (
    id INT AUTO_INCREMENT,
    name VARCHAR(30),
    CONSTRAINT pk_personType PRIMARY KEY(id)
);

/**
* PERSON STAUS  ACTIVE, DELETED , SUSPENDED
*/
CREATE  TABLE  state(
    id INT AUTO_INCREMENT,
    name VARCHAR(30),
    CONSTRAINT pk_personType PRIMARY KEY(id)
);

/**
* ADDRESS HAVE TYPE SHIPIING, HOME ETC..
*/
CREATE TABLE addressType(
    id INT AUTO_INCREMENT,
    name VARCHAR(30),
    CONSTRAINT pk_personType PRIMARY KEY(id)
);
/**
* Person table ,this table represents every person
* in the system may type of persons are in this system
* CLIENT,SUPPLIER,EMPLOYEE,OUTSOURCER
*/

CREATE  TABLE  person (
    id INT AUTO_INCREMENT,
    createDate DATE,
    addBy INT,
    modifyDate DATE,
    modifyBy INT,
    fName VARCHAR(30),
    lName VARCHAR(30),
    dob date,
    nic VARCHAR(15),
    email VARCHAR(60) UNIQUE,
    type INT,
    status INT,
    CONSTRAINT pk_person PRIMARY KEY(id),
    CONSTRAINT fk_person_personType FOREIGN KEY (type) REFERENCES personType(id),
    CONSTRAINT fk_person_personStatus FOREIGN KEY (status) REFERENCES state(id),
    CONSTRAINT fk_person_personModifyBy FOREIGN KEY (modifyBy) REFERENCES person(id),
    CONSTRAINT fk_person_personaddBy FOREIGN KEY (addBy) REFERENCES person(id)
);


/**
* Person or company can have many addresses
*/
CREATE TABLE address (
	id INT AUTO_INCREMENT, -- a unique one has to be there as a certain person can have several address of the same category.
    userId INT,
    type INT,
    addressNo VARCHAR(30),
    addressStreet1 VARCHAR(30),
    addressStreet2 VARCHAR(30),
    addressStreet3 VARCHAR(30),
    addressCity VARCHAR(30),
    addressCountry VARCHAR(30),
    contactPreson VARCHAR(128),
    telephoneNumber VARCHAR(15),
    CONSTRAINT pk_address PRIMARY KEY(id),
    CONSTRAINT fk_address_person FOREIGN KEY (userId) REFERENCES person(id),
    CONSTRAINT fk_address_addressType FOREIGN KEY (type) REFERENCES addressType(id)
);
/**
* Person can have many teliphone numbers
*/
CREATE TABLE teliphone (
    id INT,
    number CHAR(13),
    CONSTRAINT fk_teliphone_person FOREIGN KEY (id) REFERENCES person(id),
    CONSTRAINT pk_teliphone PRIMARY KEY(id,number)
);

/**
* User table user can be only an employee
*/
CREATE TABLE user_type(
id INT AUTO_INCREMENT,
    name VARCHAR(30),
    CONSTRAINT pk_personType PRIMARY KEY(id)
);

CREATE TABLE user (
    id INT UNIQUE,
    type INT,
    username VARCHAR(30) UNIQUE,
    password VARCHAR(30),
    passwordHash VARCHAR(30),
    CONSTRAINT pk_user PRIMARY KEY (id,type),
    CONSTRAINT fk_user FOREIGN KEY (id) REFERENCES person(id),
     CONSTRAINT fk_user_userType FOREIGN KEY (type) REFERENCES user_type(id)
);

/************* MATERIAL TABLES ***********************/
CREATE TABLE material_category(
    id INT AUTO_INCREMENT,
    name varchar(60),
    CONSTRAINT pk_materialCategory PRIMARY KEY(id)
);

CREATE TABLE material(
    id INT AUTO_INCREMENT,
    name VARCHAR(60),
    categoryId INT,
    availableQty INT,
    pendingQty INT,
    brand VARCHAR(60),
    description VARCHAR(128),
    CONSTRAINT pk_material PRIMARY KEY(id),
    CONSTRAINT pk_material_materialCatogory FOREIGN KEY (categoryId) REFERENCES material_category(id)
);
/**
* One material can be supplied many supliers and supliers can suplie many material
*/
CREATE TABLE material_suplier(
suplierId INT,
materialId INT,
price INT,
CONSTRAINT pk_materialSuplier PRIMARY KEY(suplierId,materialId),
CONSTRAINT pk_materialSuplier_person FOREIGN KEY (suplierId) REFERENCES person(id),
CONSTRAINT pk_materialSuplier_material FOREIGN KEY (materialId) REFERENCES person(id)
);


/************* PRODUCT TABLES ***********************/


/**
* BOOK AND CHACPTER AND PAGES
*/
CREATE TABLE book_medium(
    id INT AUTO_INCREMENT,
    medium varchar(60),
    CONSTRAINT pk_bookMedium PRIMARY KEY(id)
);

CREATE TABLE grade(
    id INT AUTO_INCREMENT,
    name varchar(60),
    CONSTRAINt pk_grade PRIMARY KEY(id)
);
CREATE TABLE book(
    id INT AUTO_INCREMENT,
    availableQty INT,
    pendingQty INT,
    name VARCHAR(120),
    medium INT,
    grade INT,
    authorName VARCHAR(120),
    noOfPages INT NOT NULL,
    status INT,
    price DECIMAL(8,2), 
    CONSTRAINT pk_book PRIMARY KEY(id),
    CONSTRAINT fk_book_state FOREIGN KEY (status) REFERENCES state(id),
    CONSTRAINT fk_book_medium FOREIGN KEY (medium) REFERENCES book_medium(id),
    CONSTRAINT fk_grade FOREIGN KEY (grade) REFERENCES grade(id)
);

CREATE TABLE chapter(
    id INT AUTO_INCREMENT, -- not suitable for the chapters
    name VARCHAR(120),
    noOfPages INT NOT NULL,
    bookId INT NOT NULL,
    -- materialId INT,-- a chapter can have more than one material as there the cover f the chp is printed in a different material .
    availableQty INT,
    CONSTRAINT pk_chapter PRIMARY KEY(id),
    CONSTRAINT fk_chapter_book FOREIGN KEY(bookId) REFERENCES book(id)
--     CONSTRAINT fk_chapter_material FOREIGN KEY(materialId) REFERENCES material(id)
);

CREATE TABLE pages(
    id INT AUTO_INCREMENT, -- not suitable for the pages
    pageNumber INT NOT NULL,
    chapterId INT NOT NULL,
    availableQty INT,
    CONSTRAINT pk_page PRIMARY KEY(id),
    CONSTRAINT fk_page_chapter FOREIGN KEY(chapterId) REFERENCES chapter(id)
);

/************* JOB TABLES ***************************/

/**
* WAITING,HOLD,STARTED,PROGRESS,COMPLETED ETC
*/

CREATE TABLE task_state(
    id INT AUTO_INCREMENT,
    name varchar(30),
    CONSTRAINT pk_taskState PRIMARY KEY(id)
);

/**
* INHOUSE, OUTSORCE ,INHOUSE AND OUTSORCE
*/

CREATE TABLE task_exicute_method(
    id INT AUTO_INCREMENT,
    name varchar(30),
    CONSTRAINT pk_taskExicuteMethod PRIMARY KEY(id)
);

/**
* PRINT,BIND,GATHER
*/
CREATE TABLE task_type(
    id INT AUTO_INCREMENT,
    name varchar(30),
    CONSTRAINT pk_taskType PRIMARY KEY(id)
);

/**
* An order can have may Jobs
*/
CREATE TABLE orders(
    id INT AUTO_INCREMENT,
    createDate DATE,
    createBy INT,
    modifyDate DATE,
    modifyBy INT,
    client INT,
    state INT, 					-- ACTIVE, DELETED, SUSPENDED
    CONSTRAINT pk_order PRIMARY KEY(id),
    CONSTRAINT fk_order_oderState FOREIGN KEY (state) REFERENCES state(id),
    CONSTRAINT fk_order_person_ModifyBy FOREIGN KEY (modifyBy) REFERENCES person(id),
    CONSTRAINT fk_order_person_createBy FOREIGN KEY (createBy) REFERENCES person(id),
    CONSTRAINT fk_order_person_Client FOREIGN KEY (client) REFERENCES person(id)
);
/**
*
*/
CREATE TABLE job(
    id INT AUTO_INCREMENT,
	productId INT,  			-- Each job have paticular product(book)
    orderId INT,
    createDate DATE,
    createBy INT,
    modifyDate DATE,
    modifyBy INT,
    startDate DATE,
    endDate DATE,
    quantity INT,           -- number of finished goods
    state INT, 				-- WAITING,HOLD,STARTED,PROGRESS,COMPLEATED 
    CONSTRAINT pk_job PRIMARY KEY(id),
    CONSTRAINT fk_job_order FOREIGN KEY (orderId) REFERENCES orders(id),
    CONSTRAINT fk_job_oderState FOREIGN KEY (state) REFERENCES task_state(id),
    CONSTRAINT fk_job_person_ModifyBy FOREIGN KEY (modifyBy) REFERENCES person(id),
    CONSTRAINT fk_job_person_createBy FOREIGN KEY (createBy) REFERENCES person(id)
);

CREATE TABLE job_task(
    id INT AUTO_INCREMENT,
    jobId INT,
    state INT, 					-- WAITING, STARTED Etc.
    taskType INT,			 	-- PRINT, BIND, GATHER
    taskExicuteMethod INT, 		-- INHOUSE, OUTSORCE
    createDate DATE,
    createBy INT, 				-- WHO CREATE THIS RECORD
    modifyDate DATE,
    modifyBy INT,				-- IF SOMEONE MODIFIED WHO MODIFIED
    startDate DATE,
    endDate DATE,
    quantity INT,               -- the final quantity at the end of each tasktype --has to check whether expected quantity to be included as well.
    CONSTRAINT pk_jobTask PRIMARY KEY(id),
    CONSTRAINT fk_jobTask_job FOREIGN KEY (jobId) REFERENCES job(id),
    CONSTRAINT fk_jobTask_taskState FOREIGN KEY (state) REFERENCES task_state(id),
    CONSTRAINT fk_jobTask_taskExicuteMethod FOREIGN KEY (taskExicuteMethod) REFERENCES task_exicute_method(id),
    CONSTRAINT fk_jobTask_taskType FOREIGN KEY (taskExicuteMethod) REFERENCES task_exicute_method(id),
    CONSTRAINT fk_jobTask_person_ModifyBy FOREIGN KEY (modifyBy) REFERENCES person(id),
    CONSTRAINT fk_jobTask_person_createBy FOREIGN KEY (createBy) REFERENCES person(id)
);
/**
* One vendor can have many job_task one job task can get may vendors
*/
CREATE TABLE job_task_vendor(
    taskId INT,
    vendorId INT, 		-- PERSON ID WHO GET THE JOB
    quantityGiven INT, 		-- QUENTITY ALOCATE
    initDate DATE,
    finished Date,     -- the date in which the vendor has finished doing the task  or the date which the output is passed down to then next stage.
    expectedFinished DATE ,  -- the date which the vendor is expected to give out the finished product.(supplier)
    CONSTRAINT pk_job_vendor PRIMARY KEY (taskId,vendorId),
    CONSTRAINT fk_jobTaskVendor_person FOREIGN KEY (vendorId) REFERENCES person(id),
	CONSTRAINT fk_jobTaskVendor_JobTask FOREIGN KEY (taskId) REFERENCES job_task(id)
);

/************* FINANCE TABLES ***********************/

/**
*there are several discount types
*
*/

-- CREATE TABLE discount(

-- )



