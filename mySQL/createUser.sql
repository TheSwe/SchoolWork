use mediadb;


create table user(
userName varchar(255),
userPassword varchar(255),
userEmail varchar(255),
userAge tinyint,
userPhoneNr varchar(12),
primary key(userName)
);

create table watchedlist(
userName varchar(255),
ID int,
foreign key (userName) references user(userName),
foreign key (ID) references movies(ID),
primary key(userName, ID)
);