package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            String query = "select title, director from movies";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(rs.toString());
            //System.out.println(rs.getString("title"));
            while (rs.next()) {
                
                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}