CREATE DATABASE if not exists mediaDB;

use mediaDB;
drop table if exists movies;
create table movies(
ID int auto_increment,
title varchar(255),
releaseYear year,
runtime smallint,
director varchar(255),
summary varchar(255),
subtitle varchar(255),
primary key(ID)
);


insert into movies (title, releaseyear, runtime, director) values
("The Shawshank Redemption",1994,142,"Frank Darabont"),
("Interstellar",2014,169,"Christopher Nolan"),
("Mamamia",2008,108,"Phyllida Lloyd"),
("Oppenheimer",2023,180,"Christopher Nolan"),
("South Park - Bigger Longer & Uncut",1999,81,"Trey Parker"),
("Pulp Fiction",1994,154,"Quentin Tarantino"),
("Back to the Future",1985,116,"Robert Zemeckis"),
("1984",1984,113,"Michael Radford"),
("Forrest Gump",1994,142,"Robert Zemeckis"),
("King Kong",2005,187,"Peter Jackson"),
("Edge of Tomorrow",2014,113,"Doug Liman"),
("Snatch",2000,104,"Guy Ritchie"),
("Jurassic Park",1993,127,"Steven Spielberg"),
("Revolver",2005,111,"Guy Ritchie"),
("The Lord of the Rings: The Fellowship of the Ring",2001,178,"Peter Jackson"),
("E.T. the Extra-Terrestrial",1982,115,"Steven Spielberg"),
("The Lord of the Rings",1978,132,"Ralph Bakshi"),
("The Incredibles",2004,115,"Brad Bird"),
("300",2006,117,"Zack Snyder"),
("The Mask",1994,101,"Chuck Russell"),
("The Great Dictator",1940,125,"Charles Chaplin"),
("Spaceballs",1987,96,"Mel Brooks"),
("Love Actually",2003,135,"Richard Curtis"),
("Arrival",2016,116,"Denis Villeneuve"),
("Office Space",1999,89,"Mike Judge"),
("Bram Stoker's Dracula",1992,128,"Francis Ford Coppola"),
("Zack Snyder's Justice League",2021,242,"Zack Snyder"),
("Watchmen",2009,162,"Zack Snyder"),
("Il buono, il brutto, il cattivo",1966,161,"Sergio Leone"),
("Batman Begins",2005,140,"Christopher Nolan"),
("Iron Man",2008,126,"Jon Favreau"),
("Life of Brian",1979,94,"Terry Jones"),
("Batman Forever",1995,121,"Joel Schumacher"),
("Chaos",2005,106,"Tony Giglio"),
("Blade",1998,120,"Stephen Norrington"),
("The Meaning of Life",1983,187,"Terry Jones"),
("Terminator",1984,187,"James Cameron"),
("Titanic",1997,194,"James Cameron"),
("Predator",1987,107,"John McTiernan"),
("For the Birds",2000,3,"Ralph Eggleston"),
("Kung Fury",2015,31,"David Sandberg"),
("Kung fu",2004,99,"Stephen Chow"),
("Le cinquième élément",1997,126,"Luc Besson"),
("Star Wars",1977,121,"George Lucas"),
("A Close Shave",1995,30,"Nick Park"),
("A Grand Day Out",1989,23,"Nick Park"),
("Team America: World Police",2004,98,"Trey Parker");

insert into movies (title, releaseYear, runtime) values
("Avengers: Endgame",2019,181),
("The Lion King",1994,88),
("King Kong",1933,100),
("Crank",2006,88),
("Monty Python and the Holy Grail",1975,91);

drop table if exists rating;
create table rating(
ratingNr int auto_increment,
ratingText varchar(255),
primary key(ratingNr)
);

insert into rating (ratingText) values
("Very bad"), 
("Bad"), 
("Neutral"), 
("Good"),
("Very good");

alter table movies add rating tinyint check (rating >= 1 and rating <= 5);

update movies set 



