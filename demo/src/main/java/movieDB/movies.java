package movieDB;

import java.util.Scanner;
import java.sql.*;

public class movies {
    public static void moviesMenu(Connection conn, Scanner scanner, String username) throws SQLException{
        System.out.println("1. Search movie by release year");
        System.out.println("2. Search movie by director");
        System.out.println("3. Search movie by title/title part");
        System.out.println("4. Add movie to database");
        System.out.println("5. Mark movie as seen");
        System.out.println("6. Show all seen movies");
        System.out.println("7. Close");
        System.out.println("Type the number corresponding to your desired action:");

        String action = scanner.nextLine();
        
        switch (action) {
            case "1":
                releaseYearSearch(conn, scanner, username);
                break;
            case "2":
                directorSearch(conn, scanner, username);
                break;
            case "4":
                addMovie(conn, scanner, username);
                break;
            case "5":
                markSeen(conn, scanner, username);
                break;
            case "6":
                printSeen(conn, scanner, username);
                break;
            case "7":
                System.exit(0);
            default:
                System.out.println("Input incorrect, make sure to only include the number of the desired action");
                moviesMenu(conn, scanner, username);
        }
    }
    public static void releaseYearSearch(Connection conn, Scanner scanner, String username) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("select title,director,runtime from movies where releaseyear=?");

        System.out.println("Release year (XXXX):");
        String searchYear = scanner.nextLine();

        stmt.setString(1, searchYear);
        ResultSet rs = stmt.executeQuery();
        if (rs.isBeforeFirst()){

            while (rs.next()){
                System.out.println(rs.getString(1)+" directed by "+rs.getString(2)+". The movie runtime is "+rs.getString(3)+" minutes"); 
            }
            moviesMenu(conn, scanner, username);
        } else {
            System.out.println("No movies in the database where released in"+searchYear);
            moviesMenu(conn, scanner, username);
        }
    }
    public static void directorSearch(Connection conn, Scanner scanner, String username) throws SQLException{
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
            moviesMenu(conn, scanner, username);
        } else {
            System.out.println("No movies in the database where directed by"+director);
            moviesMenu(conn, scanner, username);
        }
    }
    public static void addMovie(Connection conn, Scanner scanner, String username) throws SQLException{
        

    }
    public static void markSeen(Connection conn, Scanner scanner, String username) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("insert into watchedlist values (?, ?)");

    }
    public static void printSeen(Connection conn, Scanner scanner, String username) throws SQLException{
        
    }
}
