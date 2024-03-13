CREATE DATABASE if not exists myTestDB;

use myTestDB;
drop table user;
create table user(
ID int,
username varchar(255),
email varchar(255),
password varchar(255) not null,
age int not null,
primary key(ID),
unique(username),
unique(email)
);
