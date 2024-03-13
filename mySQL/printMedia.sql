use mediaDB;
/*select * from movies;*/
/*select * from series;*/
/*select * from episodes;*/
/*select * from rating;*/

/*E nivå selects*/
/*Skriv selects som kan svara på dessa frågor.
Visar alla filmers titel och runtime där directorn heter "Steven Spielberg"
Väljer ut den längsta filmen.
Visa antalet filmer och sätt namnet på kolumnen till AntalFilmer
Visar titel, director och runtime i minskande ordning för alla filmer från 1994*/
select title, runtime from movies where director = "Steven Spielberg";
select max(runtime) from movies;
select count(ID) as AntalFilmer from movies;
select title, director, runtime from movies where releaseYear = 1994 order by runtime desc;
/*C nivå selects*/
/*Visa upp titel på filmen, directorn samt dess rating för alla filmer med en rating på 4 eller 5. (minst 3 st).
Visar alla filmer som är under 30 min
Tar bort alla filmer som är under 30 min
Väljer ut den kortaste filmen.
Väljer ut alla filmer som har en titel som innehåller ordet “The”
*/

/*A nivå selects*/
/*Vilka stars är director för sina egna filmer?
Titel på filmen samt förnamn och efternamn på den star som har varit med i mer än 1 film
*/