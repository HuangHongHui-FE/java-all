package basic.module;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1. 导包：也就是指出需要使用的类，在什么位置。
import 包名称.类名称;

对于和当前类属于同一个包的情况，可以省略导包语句不写。

2. 创建，格式：
类名称 对象名 = new 类名称();
StudentPro stu = new StudentPro();

3. 使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
 */
public class Demo16Module {

    public static void main(String[] args) {
        // 1. 导包。
        // 我需要使用的StudentPro类，和我自己Demo02StudentPro位于同一个包下，所以省略导包语句不写

        // 2. 创建，格式：
        // 类名称 对象名 = new 类名称();
        // 根据StudentPro类，创建了一个名为stu的对象
        StudentPro stu = new StudentPro();

        // 3. 使用其中的成员变量，格式：
        // 对象名.成员变量名
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("=============");

        // 改变对象当中的成员变量数值内容
        // 将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name); // 赵丽颖
        System.out.println(stu.age); // 18
        System.out.println("=============");

        // 4. 使用对象的成员方法，格式：
        // 对象名.成员方法名()
        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println("=============");


        // 传参传地址
        method(stu);
        System.out.println("=============");



        StudentPro one = getStudent();
        System.out.println(one.name);
    }

    public static void method(StudentPro param) {
        System.out.println(param.name);
        System.out.println(param.age);
    }


    public static StudentPro getStudent() {
        StudentPro one = new StudentPro();
        one.name = "苹果";
        one.age = 8388;
        return one;
    }


}

