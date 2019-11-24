use inf;
insert into persontype(id,name) 
	values
		(1,"Employee"),
        (2,"Client"),
        (3,"Suplier");
insert into state(id,name)
	values
		(1,"Active"),
        (2,"Deleted"),
        (3,"Suspended");
insert into addresstype(id,name)
	values
		(1,"Genaral"),
        (2,"Billing"),
        (3,"Branch"),
        (4,"Delivery");
        
insert into user_type (id,name)
	values 
		(1,"Admin"),
        (2,"Accountant"),
        (3,"Production"),
        (4,"Store keeper");

insert into person (id,fName,Lname,dob,nic,email,type,status)
	value
		(1,"Wade","Dave","1992/07/17","ET021616C","dave@abc.com",1,1),
        (2,"Jorge","Riley","1992/07/17","YW103899B","riley@abc.com",1,1),
       (3,"Jim","Ben","1996/01/30","1234567890v","jim@yahoo.com",2,3),
		(4,"Timmy","Harry","2000/01/30","0987654321v","timmy@yahoo.com",3,1),
	     (5,"Sarasavi","HQ",NULL,NULL,"sarasavi@yahoo.com",2,1);
insert into address (userId,type,addressNo,addressStreet1,addressStreet2,addressStreet3,addressCity,addressCountry)
	values
			(1,1,"10/A","Union Terrace",NULL,NULL,"London","UK"),
            (2,1,"67","Crown Streetaddress",NULL,NULL,"London","UK"),
            (1,2,"210","1st Lane","Katuwane",NULL,"Homagama","Sri Lanka"),
			(4,2,"67","2nd Lane",Null,NULL,"Piliyandala","Sri Lanka"),
			(3,3,"234","6th Avenue","Home Street","Bell Place","Colombo"," Sri Lanka");
insert into teliphone (id,number)
	values
		(1,"07844951980"),
        (2,"07823736091"),
        (3,"07112342342"),
        (4,"01123234535"),
        (5,"07543492023");
insert into user (id,type,username,password)
	values
		(1,1,"dave","qazwsx"),
        (2,2,"riley","qazwsx"),
        (3,1,"Ben","qwertyu"),
        (4,2,"Harry","12345678");
        
-- material tables-- 

insert into material_category (id, name)
	values
		(1,"Ink"),
        (2,"Paper"),
        (3,"cardboard"),
        (4,"stationary");
        
        
insert into material (id, name, categoryId, availableQty, pendingQty, brand)
	values
		(1,"A4",2,100,100,"JK Easy Copier"),
        (2,"Black and White",1,NUll,200,"Five Stars"),
        (3,"Blue Pen",4,100,Null,"Atlas"),
        (4,"dimay",2,100,100,"JK Easy Copier");
        
        
insert into material_suplier(suplierId, materialId, price)
	values
		(1,2,123.45),
        (2,1,2000),
        (1,3,12 );
        

-- Product Tables
        
insert into book_medium(id, medium)
	values
		(1,"Sinhala"),
        (2,"English"),
        (3,"Tamil");
        
insert into grade (id, name)
	values
		(1,"Grade 1"),
        (2,"Grade 2"),
        (3,"Grade 3"),
        (4,"Grade 4"),
        (5,"Grade 5"),
        (6,"Grade 6"),
        (7,"Grade 7"),
        (8,"Grade 8"),
        (9,"Grade 9"),
        (10,"Grade O/L"),
        (11,"Grade A/L");
        
        
 insert into book(id, availableQty, pendingQty, name, medium, grade, authorName, noOfPages, status, price)
	values
		(1,100,NULL,"Chemistry MCQ",1,11,"J.K Dissanayaka",200,1,100.05),
        (2,100,100,"Sinhala Essay",1,10,"J.K Dissanayaka",200,1,100.05),
        (3,NULL,250,"ICT MCQ",2,11,"J.K Dissanayaka",100,1,100.05);
        
insert into chapter(id, name, noOfPages, bookId, availableQty)
	values
		(1, "Cover", 1, 1, 85),
		(2, "Chp1", 10, 1, 100),
        (3, "Chp2", 8, 1, 90);

insert into pages (id, pageNumber, chapterId, availableQty)
	values
		(1, 1, 2, 100),
        (2, 2, 2, 95),
        (3, 3, 2, 100),
        (4, 4, 2, 100);
    
    -- Job Tables
    
insert into task_state (id, name)
	values
		(1, "Started"),
        (2, "Processing"),
        (3, "Completed"),
        (4, "On Hold"),
        (5, "Waiting"); 
        
insert into task_exicute_method (id, name)
	values
		(1, "Inhouse"),
        (2, "Outsource"),
        (3, "Both");
        
insert into task_type (id, name)
	values
		(1, "Print"),
        (2, "Bind"),
        (3, "Gather"),
        (4, "Packing");
        
insert into orders (id, createDate, createBy, modifyDate, modifyBy, client, state)
	values
		(1, 1/1/2019, 1, 2/1/2019, 1, 3, 1),
        (2, 11/10/2019, 2, NULL, NULL, 4, 2),
        (3, 24/10/2019, 2, 30/10/2019, 1, 3, 1);
        
insert into job (id, productId, orderId, createDate, createBy, modifyDate, modifyBy, startDate, endDate, quantity, state)
	values
		(1, 1, 1, 3/1/2019, 2, NULL, NULL, 5/1/2019, 20/1/2019, 1000, 3),
        (2,2,2,11/10/2019, 2, NULL, NULL, 13/10/2019, 5/11/2019, 1000, 2);
        
-- insert into job_task(id, jobId, state, taskType, taskExicuteMethod, createDate, createBy, modifyDate, modifyBy, startDate, endDate, quantity)
-- 	values
-- 		(1, 1, 1, 1, 3/1/2019, 2, NULL, NULL, 4/1/2019, 14/1/2019, 1000),
	-- 	(2, 1, 2, 2, 13/1/2019, 2, 15/1/2019, 1, 15/1/2019/,20/1/2019, 990),
-- 		(3, 2, 1, 1, 13/10/2019, 1, NULL, NULL, 20/10/2019/, 25/10/2019, 1000);
         
-- insert into job_task_vendor(taskId, vendorId, quantityGiven, initDate, finished, expectedFinished)
-- 	values
-- 		(1, 4, 100, 1/1/2019, 1/2/2019, 1/2/2019),
--         (2, 4, 150, 10/11/2019/, 30/11/2019, 25/11/2019);
--         
	
        