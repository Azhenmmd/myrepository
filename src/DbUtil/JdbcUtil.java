package DbUtil;

import java.sql.*;


/**
 * JDBC工具类
 * @Author: 龚智臻
 * @Date: 2019/6/15
 */
public class JdbcUtil {
    private static Connection conn;
    private static PreparedStatement pst;

    public static PreparedStatement getPst(String sql){
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
            pst = conn.prepareStatement(sql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return pst;
    }
    public static void close(ResultSet rs){
        try {
            if (rs!=null){
                rs.close();
            }
            if (pst!=null){
                pst.close();
            }
            if (conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}