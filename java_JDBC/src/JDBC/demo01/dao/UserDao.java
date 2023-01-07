package JDBC.demo01.dao;

import JDBC.demo01.entity.Student;
import JDBC.demo01.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    //1.通过id进行查询
    public Student findById(int id) throws SQLException {
        String sql="select * from student where id=?";
        Connection c = JDBCUtils.getConnection();
        PreparedStatement p = c.prepareStatement(sql);
        p.setInt(1,id);
        ResultSet set = p.executeQuery();
        Student student=new Student();
        if(set.next()){
            student.setId(set.getInt("id"));
            student.setAge(set.getInt("age"));
            student.setName(set.getString("name"));
            student.setSchool(set.getString("school"));
        }
        return student;
    }

    //1.查询全部的student信息
    //List<泛型类型>：规定了集合添加数据的类型
    public List<Student> findAll() throws SQLException {
        //7.1创建集合对象
        ArrayList<Student> list=new ArrayList<>();
        //1.创建sql语句
        String sql="select * from student";
        //2.创建连接数据库的对象Connection
        Connection c = JDBCUtils.getConnection();
        //3.创建执行sql语句的对象PreparedStatement,并进行sql语句的预编译
        PreparedStatement p = c.prepareStatement(sql);
        //4.执行sql语句:查询：executeQuery()   增删改:executeUpdate()
        //得到查询结果集： ResultSet
        ResultSet set = p.executeQuery();
        //5.遍历查询结果集,获取数据
        while (set.next()){//集合是否有下一个元素
            //获取数据：1.列序号；2.字段名称
            //获取id   int
            int id = set.getInt(1);
            //获取名字  String
            String name = set.getString(2);
            //获取 age   int
            int age = set.getInt("age");
            //获取学校名称   String
            String school = set.getString("school");
            //6.将获取封装到Student对象中
            Student student=new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            student.setSchool(school);
            //7.2.将student对象放入 List集合中
            list.add(student);
        }
        //8.返回集合对象
        return list;
    }

    //2.通过用户名和id进行查询
    public Student findByNameId(String name,int id) throws SQLException {
        //1.创建sql语句
        String sql="select * from student where name=? and id=?";
        //2.创建连接数据库的对象
        Connection c = JDBCUtils.getConnection();
        //3.创建执行sql对象,并进行sql语句的预编译
        PreparedStatement p = c.prepareStatement(sql);
        //4.设置参数
        p.setString(1,name);
        p.setInt(2,id);
        //5.执行sql语句,获取查询结果集
        ResultSet set = p.executeQuery();
        //7.1 创建student对象
        Student student=new Student();
        //6.遍历结果集,获取数据
        if (set.next()){
            int id1 = set.getInt("id");
            String name1 = set.getString("name");
            int age = set.getInt("age");
            String school = set.getString("school");
            //7.2.数据封装到student对象里
            student.setSchool(school);  student.setAge(age);
            student.setName(name1); student.setId(id1);
        }
        //返回student对象
        return student;
    }

    //3. 添加一条信息
    public boolean insert(Student student) throws SQLException {
        //1.设置sql语句
        String sql="insert into student (name,age,school) values(?,?,?)";
        //2.创建连接数据库的对象
        Connection c = JDBCUtils.getConnection();
        //3.创建执行sql语句的对象,预编译sql语句
        PreparedStatement p = c.prepareStatement(sql);
        //4.设置参数
        p.setString(1,student.getName());
        p.setInt(2,student.getAge());
        p.setString(3,student.getSchool());
        //5.执行sql语句executeUpdate():增删改，返回结果是 影响的行数
        int i = p.executeUpdate();
        //6.判断 i的值
        if (i>0){//添加成功
            return true;
        }
        return false;
    }

    //4.通过id进行删除
    public boolean deleteById(int id) throws SQLException {
        String sql="delete from student where id=?";
        Connection c = JDBCUtils.getConnection();
        PreparedStatement p = c.prepareStatement(sql);
        p.setInt(1,id);
        int i = p.executeUpdate();
        if (i>0){//删除成功
            return true;
        }
        return false;
    }
}
