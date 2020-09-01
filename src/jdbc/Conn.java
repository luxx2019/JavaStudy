package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public Connection getConnection() {
        try {
            int i = 5;
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
        int i = 5;
        return null;
    }

    public static void main(String[] args) {
        Conn c = new Conn();
        c.getConnection();
    }
}
