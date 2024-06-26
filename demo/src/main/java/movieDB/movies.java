package movieDB;

import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;

public class movies {
    public static boolean moviesMenu(Connection conn, Scanner scanner, String username) throws SQLException{
        //Simple menu to get to know what the user wants
        System.out.println("1. Search movie by release year");
        System.out.println("2. Search movie by director");
        System.out.println("3. Add movie to database");
        System.out.println("4. Mark movie as seen");
        System.out.println("5. Show all seen movies");
        System.out.println("6. Log out");
        System.out.println("7. Close");
        System.out.println("Type the number corresponding to your desired action:");

        String action = scanner.nextLine();
        
        switch (action) {
            case "1":
                releaseYearSearch(conn, scanner);
                break;
            case "2":
                directorSearch(conn, scanner);
                break;
            case "3":
                addMovie(conn, scanner);
                break;
            case "4":
                markSeen(conn, scanner, username);
                break;
            case "5":
                printSeen(conn, username);
                break;
            case "6":
                System.out.println("Logging out");
                return false;
            case "7":
                //conn.close();
                //scanner.close();
                System.exit(0);
            default:
                System.out.println("Input incorrect, make sure to only include the number of the desired action");        
        }
        return true;
    }
    public static void releaseYearSearch(Connection conn, Scanner scanner) throws SQLException{
        //searches by year, searches by string to avoid input throwing exceptions when test is written
        PreparedStatement stmt = conn.prepareStatement("select title,director,runtime from movies where releaseyear=?");

        int searchYear = 0;
        System.out.println("When was the movie released?");
            if (scanner.hasNextInt()){
                searchYear = scanner.nextInt();
            }
            scanner.nextLine();
            while(searchYear < 1901 || searchYear > 2155){
                System.out.println("The database only accepts movies released after 1901, try again");
                if (scanner.hasNextInt()){
                    searchYear = scanner.nextInt();
                }
                scanner.nextLine();
            }

        stmt.setInt(1, searchYear);
        ResultSet rs = stmt.executeQuery();
        if (rs.isBeforeFirst()){

            while (rs.next()){
                System.out.println(rs.getString(1)+" directed by "+rs.getString(2)+". The movie runtime is "+rs.getString(3)+" minutes"); 
            }
            
        } else {
            System.out.println("No movies in the database where released in "+searchYear);
            
        }
    }
    public static void directorSearch(Connection conn, Scanner scanner) throws SQLException{
        //Searches for a director and prints all movies directed by that director
        PreparedStatement stmt = conn.prepareStatement("select title,releaseyear from movies where director=?");

        System.out.println("Director (Firstname Lastname):");
        String director = scanner.nextLine();

        stmt.setString(1, director);
        ResultSet rs = stmt.executeQuery();
        if (rs.isBeforeFirst()){
            System.out.println(director+" directed the following movie(s):");
            while (rs.next()){
                System.out.println(rs.getString(1)+", released in "+rs.getInt(2)); 
            }
            
        } else {
            System.out.println("No movies in the database where directed by"+director);
            
        }
    }
    public static void addMovie(Connection conn, Scanner scanner) throws SQLException{
        //Inserts movies into database, asks for relevant info about movie then asks if the user wants to add another at the end
        PreparedStatement stmt = conn.prepareStatement("insert into movies (title, releaseyear, runtime, director) values (?,?,?,?)");
        String title;
        int releaseyear = 0;
        int runtime = 0;
        String director;
        String add = "Y";
        while (add == "Y"){
            System.out.println("What is the movies name?");
            title = scanner.nextLine();
            stmt.setString(1, title);

            System.out.println("When was the movie released?");
            if (scanner.hasNextInt()){
                releaseyear = scanner.nextInt();
                scanner.nextLine();
            }
            while(releaseyear < 1901 || releaseyear > 2155){
                System.out.println("The database only accepts movies released after 1901, try again");
                if (scanner.hasNextInt()){
                    releaseyear = scanner.nextInt();
                }
                scanner.nextLine();
            }
            stmt.setInt(2, releaseyear);

            System.out.println("How long is the movie in minutes?");
            if (scanner.hasNextInt()){
                runtime = scanner.nextInt();
            }
            scanner.nextLine();
            while(runtime < 30 || runtime > 300){
                System.out.println("The database only accepts movies between 30 and 300 minutes in length, try again");
                if (scanner.hasNextInt()){
                    runtime = scanner.nextInt();
                }
                scanner.nextLine();
            }
            stmt.setInt(3, runtime);

            System.out.println("Who directed the movie?");
            director = scanner.nextLine();
            stmt.setString(4, director);
            stmt.executeUpdate();
            System.out.println("Do you want to add another movie (Y/N)?");
            add = scanner.nextLine();
        }
    }
    public static void markSeen(Connection conn, Scanner scanner, String username) throws SQLException{
        //Provides a way for the user to add movies to the seen list, these are added with the username to make different users having different seen lists possible
        //If the search matches multiple movies the user is prompted to choose which one they would like to add
        PreparedStatement stmt = conn.prepareStatement("insert into watchedlist values (?, ?)");
        PreparedStatement stmtMovie = conn.prepareStatement("select ID,title from movies where title like ? ");

        stmt.setString(1, username);
        System.out.println("What movie would you like to add to your watched list?");
        String movie = scanner.nextLine();
        stmtMovie.setString(1, "%" + movie + "%");
        ResultSet movies = stmtMovie.executeQuery();

        ArrayList<String> titleList = new ArrayList<String>();
        ArrayList<Integer> idList = new ArrayList<Integer>();

        while (movies.next()){
            titleList.add(movies.getString(2));
            idList.add(movies.getInt(1));
        }

        if (titleList.isEmpty()){
            System.out.println("Your search doesn't match any movies in the database.");
            
        }/*  else if (titleList.size() == 1){
            stmt.setInt(2,idList.get(0));
            stmt.executeUpdate();
            System.out.println(titleList.get(0)+" was added to your watched movies");
            
        } */else{
            System.out.println("Your search matched this/these movies");
            for (int i = 1;  i <= titleList.size(); i++){
                System.out.println(i+": "+titleList.get(i-1));
            }
            System.out.println("Write the number of the movie you would like to add to your watched movies or 0 to add none");
            if (!scanner.hasNextInt()){
                System.out.println("No movie was added to the seen list");
                scanner.nextLine();
            } else{
                int movieindex = scanner.nextInt()-1;
                scanner.nextLine();
                if (movieindex < 0 || movieindex >= titleList.size()){
                    System.out.println("No movie was added to the seen list");
                } else {
                    stmt.setInt(2, idList.get(movieindex));
                    stmt.executeUpdate();
                    System.out.println(titleList.get(movieindex)+" was added to seen list");
                }
                    
            }

        }
    }
    public static void printSeen(Connection conn, String username) throws SQLException{
        //Gets all movies seen by the logged in user from the watchedlist table joined to the movies table to make printing more information about the movie possible. 
        PreparedStatement stmt = conn.prepareStatement("select movies.title, movies.releaseyear, movies.director from watchedlist inner join movies on watchedlist.id=movies.id where userName = ? order by movies.releaseyear asc");
        stmt.setString(1, username);
        ResultSet watched = stmt.executeQuery();
        if (!watched.isBeforeFirst()){
            System.out.println("You have no moves marked as watched");
        } else{
            while (watched.next()){
                System.out.println(watched.getString(1)+" released in "+watched.getInt(2)+" and directed by "+watched.getString(3));
            }
        }
        System.out.println();
        
    }
}
