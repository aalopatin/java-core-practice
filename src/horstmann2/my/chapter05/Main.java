package horstmann2.my.chapter05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("org.postgresql.Driver"); // force loading of driver class
        String url = "jdbc:postgresql:COREJAVA";
        String username = "postgres";
        String password = "postgres";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection.getCatalog());
    }
}
