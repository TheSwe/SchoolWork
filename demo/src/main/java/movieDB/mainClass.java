package movieDB;

import java.util.Scanner;
import java.sql.*;

public class mainClass {
    public static void main(String[] args) {
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
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            String query = "select userName, userAge from user";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(rs.toString());
            //System.out.println(rs.getString("title"));
            String title;
            while (rs.next()) {
                title = rs.getString(1);
                System.out.println(title);
            }
            String username = login.loginMenu(conn, scanner);
            System.out.println();
            System.out.println("---Logged in as: "+username+"---");
            System.out.println();
            movies.moviesMenu(conn, scanner, username);
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
