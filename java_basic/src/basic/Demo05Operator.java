package basic;
/*
运算符：进行特定操作的符号。例如：+
表达式：用运算符连起来的式子叫做表达式。例如：20 + 5。又例如：a + b

四则运算：
加：+
减：-
乘：*
除：/

取模（取余数）：%

注意事项：
	1. 一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种。
*/
public class Demo05Operator {
    public static void main(String[] args) {
        //  两个常量之间可以进行数学运算
        System.out.println(20 + 30);

        //  两个变量之间也可以进行数学运算
        int a = 20;
        int b = 30;
        System.out.println(a - b);  // -10

        // 变量和常量之间可以混合使用
        System.out.println(a * 10);  // 200

        int x = 10;
        int y = 3;

        int result1 = x / y;
        System.out.println(result1);  // 3

        int result2 = x % y;
        System.out.println(result2);  // 余数，模，1

        // int + double --> double + double --> double
        double result3 = x + 2.5;
        System.out.println(result3);  // 12.5
    }
}
