package Mysql;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Connectionsss {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/store_cms_plusplus", "root", "0945533162");
            System.out.println("SQL Connection to database established!");
            LaptopService laptopService=new LaptopService(connection);
            System.out.println(laptopService.SearchPrice(4000000l,null));
            System.out.println(laptopService.Searchmakerandssd("ACER","ssd"));

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console" + e);
            return;
        }
    }
    /*public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_cms_plusplus", "root", "0945533162");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next())
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
}
