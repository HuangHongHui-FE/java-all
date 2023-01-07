package basic;

/*
自增运算符：++
自减运算符：--


复合赋值运算符：
	+=		a += 3		相当于		a = a + 3
	-=		b -= 4		相当于		b = b - 4
	*=		c *= 5		相当于		c = c * 5
	/=		d /= 6		相当于		d = d / 6
	%=		e %= 7		相当于		e = e % 7
*/
public class Demo05Operator2 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        ++num1; // 单独使用，前++
        System.out.println(num1); // 11
        num1++; // 单独使用，后++
        System.out.println(num1); // 12
        System.out.println("=================");

        // 与打印操作混合的时候
        int num2 = 20;
        // 混合使用，先++，变量立刻马上变成21，然后打印结果21
        System.out.println(++num2); // 21
        System.out.println(num2); // 21
        System.out.println("=================");

        int num3 = 30;
        // 混合使用，后++，首先使用变量本来的30，然后再让变量+1得到31
        System.out.println(num3++); // 30
        System.out.println(num3); // 31
        System.out.println("=================");

        int num4 = 40;
        // 和赋值操作混合
        int result1 = --num4; // 混合使用，前--，变量立刻马上-1变成39，然后将结果39交给result1变量
        System.out.println(result1); // 39
        System.out.println(num4); // 39
        System.out.println("=================");

        int num5 = 50;
        // 混合使用，后--，首先把本来的数字50交给result2，然后我自己再-1变成49
        int result2 = num5--;
        System.out.println(result2); // 50
        System.out.println(num5); // 49
        System.out.println("=================");

        int x = 10;
        int y = 20;
        // 11 + 20 = 31
        int result3 = ++x + y--;
        System.out.println(result3); // 31
        System.out.println(x); // 11
        System.out.println(y); // 19

        // 30++; // 错误写法！常量不可以使用++或者--





        // 复合赋值运算符

        int a = 10;
        // 按照公式进行翻译：a = a + 5
        // a = 10 + 5;
        // a = 15;
        // a本来是10，现在重新赋值得到15
        a += 5;
        System.out.println(a); // 15

        int x1 = 10;
        // x1 = x1 % 3;
        // x1 = 10 % 3;
        // x1 = 1;
        // x1本来是10，现在重新赋值得到1
        x1 %= 3;
        System.out.println(x1); // 1

        // 50 = 30; // 常量不能进行赋值，不能写在赋值运算符的左边。错误写法！

        byte num = 30;
        // num = num + 5;
        // num = byte + int
        // num = int + int
        // num = int
        // num = (byte) int
        num += 5;
        System.out.println(num); // 35
    }
}
