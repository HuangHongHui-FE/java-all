package JDBC.demo01.test;

import JDBC.demo01.dao.UserDao;
import JDBC.demo01.entity.Student;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        UserDao dao=new UserDao();
        Student student = dao.findById(1);
        System.out.println(student.toString());
    }
}
