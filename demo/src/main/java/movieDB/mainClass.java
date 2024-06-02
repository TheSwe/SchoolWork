package movieDB;

import java.util.Scanner;
import java.sql.*;

public class mainClass {
    public static void main(String [] args) {
        String USER = "root";  // username in mysql
        String PASS = "DASE32&&g";// password to mysql
        /*  URL i want to connect to where:
        jdbc: is the connector
        mysql: is the database type
        localhost: is the ip im trying to connect to
        3306: is the port im trying to connect to
        mediadb is the database i want to connect to
        */
        String URL = "jdbc:mysql://localhost:3306/mediadb";
        Scanner scanner = new Scanner(System.in);
        boolean loggedin;
        //try except to catch SQL exceptions
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);

            //runs until program is exited
            while(true){
                String username = login.loginMenu(conn, scanner);
                System.out.println();
                System.out.println("---Logged in as: "+username+"---");
                System.out.println();

                loggedin = true;
                //Runs until user wants to log out
                while (loggedin == true){
                    loggedin = movies.moviesMenu(conn, scanner, username);
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("SQL error "+ex+ " was caught, restarting program");
            main(args);
        }
    }
}
