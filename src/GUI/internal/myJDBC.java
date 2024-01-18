package GUI.internal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class myJDBC {
    public static void main(String[] args) {

        try {
            Connection connection = null;
            String url= "jdbc:mysql://127.0.0.1:3306/socksorting?serverTimezone=UTC";
            String user="root";
            String pwd="root";
            connection = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Successfully connected database");

    }
}
