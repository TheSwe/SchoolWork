package arvid.kagedal;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String USER = "root";  // username in mysql
        String PASS = "DASE32&&g";// password to mysql

        String URL = "jdbc:mysql://localhost:3306/mediadb";
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            String query = "select userName, userAge from user";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(rs.toString());
            String title;
            while (rs.next()) {
                title = rs.getString(1);
                System.out.println(title);
            }
            Login.login(conn);

            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}