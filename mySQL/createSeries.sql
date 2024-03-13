CREATE DATABASE if not exists mediaDB;

use mediaDB;
drop table if exists episodes;
drop table if exists series;
create table series(
ID int auto_increment,
title varchar(255),
summary varchar(255),
subtitle varchar(255),
primary key(ID)
);

create table episodes(
seriesID int,
episodeTitle varchar(255),
seasonNr int,
episodeNr int,
releaseYear year,
summary varchar(255),
subtitle varchar(255),
director varchar(255),
primary key (seriesID, seasonNr, episodeNr),
foreign key (seriesID) references series(ID)
);
insert into series (title, summary) values
("How I met your mother", "Ted seeks love"),
("The office", "Workplace comedy antics"),
("Breaking bad", "Chemistryteacher turned methdealer");
insert into episodes (seriesID, episodeTitle, seasonNr, episodeNr, releaseYear,  director) values
(1, "Pilot", 1, 1, 2005, "Pamela Fryman"),
(1, "Purple Giraffe", 1, 2, 2005, "Pamela Fryman"),
(1, "The Sweet Taste of Liberty", 1, 3, 2005, "Pamela Fryman"),
(2, "Pilot", 1 , 1, 2005, "Ken Kwapis"),
(2, "Diversity day", 1 , 2, 2005, "Ken Kwapis"),
(2, "The Dundies", 2 , 1, 2005, "Greg Daniels"),
(3, "Pilot", 1, 1, 2008, "Vince Gillingan"),
(3, "Cat's in the Bag...", 1, 2, 2008, "Adam Bernstein"),
(3, "...And the Bag's in the River", 1, 3, 2008, "Adam Bernstein")
;
