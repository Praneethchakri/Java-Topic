create table Employee(
employeeId number(5) not null,
employeeName varchar2(250) not null,
salary int not null,
departmentId number(5),
constraint pk_Employee primary key(employeeId),
constraint fk_Employee foreign key (departmentId) References Department(departmentId)
);
drop table  Employee;
drop table Department;
commit;

create table Department(
departmentId number(5) not null,
departmentName varchar2(250) not null,
departmentHead varchar2(250) not null,
constraint  pk_department primary key (departmentId));


select * from Employee;
select * from Department;
rollback;

insert into Department values(101,'IT-Developement','MarkZukerBurg');
insert into Department values(107,'Admin-Management','BilGates');
insert into Department values(103,'Finance-Managmenet','JeffBazos');

insert into Employee values(1,'Praneeth1',150000,101);
insert into Employee values(2,'Praneeth2',160000,107);
insert into Employee values(3,'Praneeth3',170000,101);
insert into Employee values(4,'Praneeth4',180000,107);
insert into Employee values(5,'Praneeth5',190000,101);
insert into Employee values(6,'Praneeth6',1100000,101);
insert into Employee values(7,'Praneeth7',1110000,107);
insert into Employee values(8,'Praneeth8',1120000,103);
insert into Employee values(9,'Praneeth9',1120000,103);
insert into Employee values(10,'Praneeth10',1140000,103);


insert into Employee values(11,'Praneeth11',1150000,null);
insert into Employee values(12,'Praneeth12',1140000,null);
insert into Employee values(13,'Praneeth13',1140000,101);
insert into Employee values(14,'Praneeth14',1140000,103);
insert into Employee values(15,'Praneeth15',1140000,107);
update employee set salary = 1140000 where employeeid=1;

alter table  employee MODIFY departmentId number(5); 


select  max(salary) as High_Salary from employee ;


update employee set department='CEO' where employeeid=9;

alter table Employee add department varchar2(250);


select count(*) as EmployeeCount,department from employee group by department;

select employeeid,employeename,department,salary from employee order by salary desc fetch first 5 rows only;

select e.employeeName ,d.departmentName from Employee e 
inner  join department d
on e.departmentid = d.departmentId;

--e2.employeeid,e2.employeeName ,e2.salary
select  * from employee e1 
join employee e2
on 
e1.salary = e2.salary
and e1.departmentid = e2.departmentId
 where e1.employeeid=9 and e2.employeeid != 9;
 
 
 
 
 create table Orders (
 order_id number(5) not null ,
 customer_id number(5) not null,
 order_date date not null,
 constraint pk_orders primary key (order_id));
 commit;
 select * from Orders where orders.customer_id= 1;
 
 insert into Orders values (1,1,'01-JAN-2023');
 insert into Orders values (2,1,'05-JAN-2023');
insert into Orders values (14,1,'11-JAN-2023');
insert into Orders values (28,1,'01-JAN-2023');
insert into Orders values (31,1,'01-JAN-2023');
insert into Orders values (04,1,'01-FEB-2023');
insert into Orders values (10,1,'11-FEB-2023');
insert into Orders values (19,1,'21-FEB-2023');
insert into Orders values (25,1,'21-FEB-2023');
insert into Orders values (30,1,'22-FEB-2023');



 insert into Orders values (12,2,'01-JAN-2023');
 insert into Orders values (22,2,'05-JAN-2023');
insert into Orders values (142,2,'11-JAN-2023');
insert into Orders values (283,2,'01-JAN-2023');
insert into Orders values (311,3,'01-JAN-2023');
insert into Orders values (314,4,'01-JAN-2023');
insert into Orders values (315,5,'01-JAN-2023');
insert into Orders values (15,2,'01-FEB-2023');
insert into Orders values (11,11,'11-FEB-2023');
insert into Orders values (192,3,'21-FEB-2023');
insert into Orders values (289,4,'21-FEB-2023');
insert into Orders values (312,5,'22-FEB-2023');


select count(o.order_id) as orderCount ,o.customer_id from Orders o where o.order_date like '%23%' group by o.customer_id;





Select avg(e.salary),d.departmentname from employee e 
join department d 
on 
e.departmentid = d.departmentid group by d.departmentname;

select * from employee where departmentid is null;

alter table employee add hireDate date ;
commit;
select * from employee;

update employee e set e.hiredate='21-JUN-2022' where e.employeeid  in(9,10,13,14);

select extract(year from e.hiredate) as hiredYear , count(*) employeeCount, e.departmentid from employee e group by extract(year from e.hiredate),e.departmentid order by hiredYear;

create table student(
student_id number(5) not null,
studentName varchar2(250) not null,
studentTotalMarks number(5) not null,
constraint pk_student primary key(student_id));

insert into student values(1,'Praneeth1',590);
insert into student values(2,'Praneeth2',580);
insert into student values(3,'Praneeth3',550);
insert into student values(4,'Praneeth4',591);
insert into student values(5,'Praneeth5',594);
insert into student values(6,'Praneeth6',581);



select * from student ;

select max(s.studenttotalmarks) as secondHighest from student s where s.studenttotalmarks<(select max(s1.studenttotalmarks) from student s1);

select studenttotalmarks,name from( select s.studentname as name,s.studenttotalmarks,row_number() over (order by s.studenttotalmarks desc)as rank from student s ) subquery where rank=3;

