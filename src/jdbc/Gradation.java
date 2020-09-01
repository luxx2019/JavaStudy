package jdbc;

import java.sql.*;

public class Gradation {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库的驱动程序加载成功");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql:" + "//127.0.0.1:3306/db1",
                    "root", "aaa1234AAA");
            System.out.println("数据库连接成功");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Gradation g = new Gradation();
        Connection con = g.getConnection();
        try {
            Statement sql = con.createStatement();
            ResultSet res = sql.executeQuery("select * from books");
            while (res.next()) {
                System.out.println(res.getString("book_id") + "  " + res.getString("book_name")
                + "  " + res.getString("writer") + "  " + res.getString("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}