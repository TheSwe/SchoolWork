package arvid.kagedal;

import java.sql.*;
import java.util.Scanner;

public class Login {

    public static boolean login(Connection conn) throws SQLException{

        PreparedStatement stmt = conn.prepareStatement("SELECT 1 FROM user WHERE userName = ? AND userPassword = ?");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username:");
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();

        scanner.close();

        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet loginSuccess = stmt.executeQuery();
        if (loginSuccess.isBeforeFirst() ) {    
            System.out.println("Login successful");
            return true;
        } 
        System.out.println("Username or password is incorrect");
        return false;
    }

    public static void addUser(Connection conn) throws SQLException{
        try {
            PreparedStatement stmt = conn.prepareStatement("insert into user (userName, userPassword) values (?, ?);");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Username:");
            String username = scanner.nextLine();

            System.out.println("Password:");
            String password = scanner.nextLine();

            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();
            scanner.close();
        } catch (java.sql.SQLIntegrityConstraintViolationException usernameViolation) {
            System.out.println("Username taken, try again");
            addUser(conn);
        }
        
    }
}
