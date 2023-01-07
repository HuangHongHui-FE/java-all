package JDBC.demo01.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtils {
    //1.创建四个常量
    //1.1 连接数据库的驱动     8.0:com.mysql.cj.jdbc.Driver
    private final static String DRIVER="com.mysql.cj.jdbc.Driver";
    //1.2 连接数据库的路径   8.0:   jdbc:mysql://localhost:3306/school?serverTimezone=UTC
    private final static String URL="jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
    //1.3 连接数据库的用户名
    private final static String USERNAME="root";
    //1.4 连接数据库的密码
    private final static String PASSWORD="123456";

    //2.加载驱动
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("加载驱动失败");
        }
    }
    //3.创建连接数据库的对象
    public static Connection getConnection(){
        Connection connection=null;
        try {
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException throwables) {
            System.out.println("连接失败的原因是："+throwables.getMessage());
        }
        return connection;
    }
    //4.关闭数据库连接
    public static void close(PreparedStatement statement,Connection connection){
        //先连接，后关闭
        try {
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println("关闭失败");
        }
    }
}
