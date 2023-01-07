package basic;

/*
一元运算符：只需要一个数据就可以进行操作的运算符。例如：取反!、自增++、自减--
二元运算符：需要两个数据才可以进行操作的运算符。例如：加法+、赋值=
三元运算符：需要三个数据才可以进行操作的运算符。

格式：
数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B;

*/
public class Demo05Operator4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b; // 最大值的变量
        System.out.println("最大值：" + max); // 20

        // int result = 3 > 4 ? 2.5 : 10; // 错误写法！

        System.out.println(a > b ? a : b); // 正确写法！

        // a > b ? a : b; // 错误写法！
    }
}
