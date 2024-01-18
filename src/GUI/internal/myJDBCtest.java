package GUI.internal;
import java.sql.*;


public class myJDBCtest {
    public static void main(String[] args) {
        String url= "jdbc:mysql://127.0.0.1:3306/socksorting?serverTimezone=UTC";
        String user="root";
        String pwd="root";

        try {
            Connection connection = DriverManager.getConnection(url,user,pwd);
            Statement statement =connection.createStatement();
            ResultSet resultSet= statement.executeQuery("select * from sockstotpc");

            while(resultSet.next()){
                System.out.println(resultSet.getString("s_ID"));
                // System.out.println(resultSet.getString("stu_age"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("connection");
    }
}
