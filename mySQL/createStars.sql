use MediaDB;
/*
Gör tabellen stars. Varje star har förnamn, efternamn, ålder.
*/
drop table if exists stars;
create table stars(
ID int auto_increment,
fName varchar(255),
lName varchar(255),
age smallint,
primary key(ID)
);

insert into stars (fName, lName) values
("Trey","Parker"),
("Matt","Stone"),
("Samuel","L. Jackson"),
("Uma","Thurman"),
("Bruce","Willis"),
("Jason","Statham"),
("Wesley","Snipes"),
("Amy","Adams"),
("Keanu","Reeves"),
("Gary","Oldman"),
("Clint","Eastwood"),
("David","Sandberg"),
("Stephen","Chow"),
("Arnold","Schwarzenegger"),
("Leonardo","DiCaprio"),
("Linda","Hamilton"),
("Kate","Winslet"),
("Charles","Chaplin"),
("Jim","Carrey"),
("Milla","Jovovich");

drop table if exists moviesToStars;
create table moviesToStars(
movieID int,
starID int,
primary key (movieID, starID),
foreign key (movieID) references movies(ID),
foreign key (starID) references stars(ID)
);

insert into moviesToStars (movieID, starID) values
(5,1),
(5,2),
(47,1),
(47,2),
(6,3),
(6,4),
(6,5),
(43,5),
(12,6),
(14,6),
(34,6),
(34,7),
(35,7),
(24,8),
(26,9),
(26,10),
(43,10),
(29,11),
(41,12),
(42,13),
(37,14),
(39,14),
(38,15),
(37,16),
(38,17),
(21,18),
(20,19),
(33,19),
(43,20);