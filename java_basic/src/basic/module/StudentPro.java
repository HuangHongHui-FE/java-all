package basic.module;

/*
对应到Java的类当中：

成员变量（属性）：
    String name; // 姓名
    int age; // 年龄
成员方法（行为）：
    public void eat() {} // 吃饭
    public void sleep() {} // 睡觉
    public void study() {} // 学习

注意事项：
1. 成员变量是直接定义在类当中的，在方法外边。
2. 成员方法不要写static关键字。
 */
public class StudentPro {

    // 成员变量
    String name; // 姓名
    int age; // 姓名

    // 成员方法
    public void eat() {
        System.out.println("吃饭饭！");
    }

    public void sleep() {
        System.out.println("睡觉觉！");
    }

    public void study() {
        System.out.println("学习！");
    }
}

