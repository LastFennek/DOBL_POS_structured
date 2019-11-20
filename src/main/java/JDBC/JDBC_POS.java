package JDBC;

import java.sql.*;
import java.util.concurrent.ExecutionException;

public class JDBC_POS {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dobl_pos","root",""
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from car");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
