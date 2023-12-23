create database test;

use test;
create table user( id int auto_increment primary key, username varchar(255),password varchar(255),email varchar(255));
describe user;

insert into user( id,username,password,email)values(NULL,'mumbai','mumbai','mumbai@gmail.com');
select*from user;