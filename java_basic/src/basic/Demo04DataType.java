package basic;

/*

// byte short int long float double char boolean
// String
当数据类型不一样时，将会发生数据类型转换。

自动类型转换（隐式）
	1. 特点：代码不需要进行特殊处理，自动完成。
	2. 规则：数据范围从小到大。

强制类型转换（显式）
强制类型转换
	1. 特点：代码需要进行特殊的格式处理，不能自动完成。
	2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;

注意事项：
	1. 强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出。
	2. byte/short/char这三种类型都可以发生数学运算，例如加法“+”.
	3. byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算。
	4. boolean类型不能发生数据类型转换


char:
数字和字符的对照关系表（编码表）：

ASCII码表：American Standard Code for Information Interchange，美国信息交换标准代码。
Unicode码表：万国码。也是数字和符号的对照关系，开头0-127部分和ASCII完全一样，但是从128开始包含有更多字符。

48 - '0'
65 - 'A'
97 - 'a'
*/
public class Demo04DataType {
    public static void main(String[] args) {
        System.out.println(1024); // 这就是一个整数，默认就是int类型
        System.out.println(3.14); // 这就是一个浮点数，默认就是double类型

        // 左边是long类型，右边是默认的int类型，左右不一样
        // 一个等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储
        // int --> long，符合了数据范围从小到大的要求
        // 这一行代码发生了自动类型转换。
        long num1 = 100;
        System.out.println(num1); // 100

        // 左边是double类型，右边是float类型，左右不一样
        // float --> double，符合从小到大的规则
        // 也发生了自动类型转换
        double num2 = 2.5F;
        System.out.println(num2); // 2.5

        // 左边是float类型，右边是long类型，左右不一样
        // long --> float，范围是float更大一些，符合从小到大的规则
        // 也发生了自动类型转换
        float num3 = 30L;
        System.out.println(num3); // 30.0


        // 强制类型转换

        // 左边是int类型，右边是long类型，不一样
        // long --> int，不是从小到大
        // 不能发生自动类型转换！
        // 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
        int num = (int) 100L;
        System.out.println(num);

        // long强制转换成为int类型
        int num4 = (int) 6000000000L;
        System.out.println(num4); // 1705032704

        // double --> int，强制类型转换
        int num5 = (int) 3.99;
        System.out.println(num5); // 3，这并不是四舍五入，所有的小数位都会被舍弃掉

        char zifu1 = 'A'; // 这是一个字符型变量，里面是大写字母A
        System.out.println(zifu1 + 1); // 66，也就是大写字母A被当做65进行处理
        // 计算机的底层会用一个数字（二进制）来代表字符A，就是65
        // 一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成为一个数字

        byte num6 = 40; // 注意！右侧的数值大小不能超过左侧的类型范围
        byte num7 = 50;
        // byte + byte --> int + int --> int
        int result1 = num6 + num7;
        System.out.println(result1); // 90

        short num8 = 60;
        // byte + short --> int + int --> int
        // int强制转换为short：注意必须保证逻辑上真实大小本来就没有超过short范围，否则会发生数据溢出
        short result2 = (short) (num6 + num8);
        System.out.println(result2); // 100


        // char
        char zifu3 = '1';
        System.out.println(zifu3 + 1); // 49

        char zifu2 = 'A'; // 其实底层保存的是65数字

        char zifu4 = 'c';
        // 左侧是int类型，右边是char类型，
        // char --> int，确实是从小到大
        // 发生了自动类型转换
        int num9 = zifu4;
        System.out.println(num9); // 99

//        char zifu9 = '中'; // 正确写法
//        System.out.println(zifu9 + 1); // 20013
    }
}