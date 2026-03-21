package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection getConnection() {
        String url = "jdbc:mariadb://192.168.1.52:3306/tomcatdb";
        String username = "root";
        String password = "redhat";
        Connection con = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            System.out.println("Database connection is not successful!!!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection is not successful!!!");
            e.printStackTrace();
        }
        if (con != null) {
            System.out.println("Connection successful");
        }
        return con;
    }
}

