use ck;


create table book
(
bookid int not null primary key,
bookname varchar(20) not null,
bookauthor varchar(20) not null,
bookprice int not null,
unique(bookname,bookauthor)
);

drop table book;

insert into book values(32,'junglebook','rudyardkipling',300);

select * from book;




















insert into users (name,password)values('logesh','logfort');
select * from users;







use feedbackdb;
create table students ( name varchar(20), regno int not null unique key,dob int not null);
insert into students values('logesh',100,07011998);
insert into students values('mukesh',101,05122000);
select regno,dob from students;

select name from students where regno=101;	
select regno and dob from  students where regno=101 and dob=5122000;
