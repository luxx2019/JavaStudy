package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJdbc {
    public static void main(String[] args) {
        queryDepts();
    }

    public static void queryDepts() {
        List<Dept> list = new ArrayList<>();
        try {
            //加载数据库的驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            //获取链接
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zijing_wh",
                    "root", "aaa1234AAA");

            Statement sql = conn.createStatement();
            ResultSet res = sql.executeQuery("select * from t_dept");
            while (res.next()) {
                Dept dept = new Dept();
                dept.setDeptno(res.getString("t_deptno"));
                dept.setDeptname(res.getString("t_deptname"));
                dept.setDeptloc(res.getString("t_deptloc"));
                dept.setDeptmgr(res.getString("t_deptmgr"));
                dept.setCreateTime(res.getString("t_createtime"));
                list.add(dept);
            }
            for (Dept dept : list) {
                System.out.println(dept);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
