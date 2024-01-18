package JDBC;

import java.sql.*;

public class Connect {
    public static void main(String[] args) {

        String url= "jdbc:mysql://127.0.0.1:3306/coffeshopdb?serverTimezone=UTC";
        String user="root";
        String pwd="root";

        try {
            Connection connection= DriverManager.getConnection(url,user,pwd);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from choc");

            while(resultSet.next()){
                System.out.println(resultSet.getString("choc_name"));
            }

        }

        catch (SQLException throwables){
            throwables.printStackTrace();
        }
        System.out.println("Successfully connected database.");
    }
}
    //