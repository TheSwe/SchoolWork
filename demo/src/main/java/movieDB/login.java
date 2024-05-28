package movieDB;

import java.util.Scanner;
import java.sql.*;


public class login {

    public static String loginMenu(Connection conn, Scanner scanner) throws SQLException{
        System.out.println("1. Sign in");
        System.out.println("2. Register user");
        System.out.println("3. Close");
        System.out.println("Type the number corresponding to your desired action:");

        String action = scanner.nextLine();
        
        switch (action) {
            case "1":
                return userLogin(conn, scanner);
            case "2":
                return addUser(conn, scanner);
            case "3":
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Input incorrect, make sure to only include the number of the desired action");
                return loginMenu(conn, scanner);
        }
    }

    public static String userLogin(Connection conn, Scanner scanner) throws SQLException {
        System.out.println("Username:");
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        PreparedStatement stmt = conn.prepareStatement("select userName from user where userName=? and userPassword=?");
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        if (rs.isBeforeFirst()){
            return username;
        } else {
            System.out.println("Wrong username or password, try again");
            return userLogin(conn, scanner);
        }
    }

    public static String addUser(Connection conn, Scanner scanner) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("insert into user (userName, userPassword, userEmail) values (?, ?, ?);");

        System.out.println("Username:");
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        try{
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, email);
            stmt.executeUpdate();
            System.out.println("Account created");
            return username;
        }   catch(SQLIntegrityConstraintViolationException ex){
            System.out.println("Username taken, try again");
            return addUser(conn, scanner);
        }   
    }
}
