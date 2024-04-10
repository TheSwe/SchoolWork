package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class testDB {

    public static void main(String[] args) {
        String USER = "root";  // username in mysql
        String PASS = "DASE32&&g";// password to mysql
        /*  URL i want to connect to where:
        jdbc: is the connector
        mysql: is the database type
        localhost: is the ip im trying to connect to
        3306: is the port im trying to connect to
        SchoolDB is the database i want to connect to
        */
        String URL = "jdbc:mysql://localhost:3306/mediadb";
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
            addUser(conn);

            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void addUser(Connection conn) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("insert into user (userName, userPassword, userAge) values (?, ?, ?);");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        System.out.println("Age:");
        int age = scanner.nextInt();

        scanner.close();

        stmt.setString(1, username);
        stmt.setString(2, password);
        stmt.setInt(3, age);
        stmt.executeUpdate();
    }
    
}