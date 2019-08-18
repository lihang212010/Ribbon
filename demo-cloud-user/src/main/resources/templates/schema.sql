drop table user if exists;
create table users( 
         id number(5) primary key not null,
         username varchar(40) not null,
         name varchar(20) not null,
         age number(3) not null,
         balance decimal(10,2)
        );
insert into users (id,username,name,age,balance) 
values(1,'account1','张三',20,100.00);

insert into users (id,username,name,age,balance) 
values(3,'account2','李四',20,100.00);

