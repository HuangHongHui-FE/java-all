package basic;

/*
定义一个方法的格式：

方法名称的命名规则和变量一样，使用小驼峰。
方法体：也就是大括号当中可以包含任意条语句。

注意事项：
2. 方法的定义不能产生嵌套包含关系。
*/
public class Demo08Method {

    public static void main(String[] args) {
        cook(); // 调用厨子的方法
        sum(1, 2);

        calculate(1, 2, 3);
    }

    // 厨子
    public static void cook() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }

    // params
    public static int sum(int a, int b) {
        System.out.println("sum方法执行啦！");
        int result = a + b;
        return result;
    }


    // 返回值设置
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c; // 总和
        int avg = sum / 3; // 平均数

        int[] array = { sum, avg };
        System.out.println("calculate方法内部数组是："+ array);
        return array;
    }
}