package basic;

/*
数组的特点：
1. 数组是一种引用数据类型
2. 数组当中的多个数据，类型必须统一
3. 数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

两种常见的初始化方式：
1. 动态初始化（指定长度）
2. 静态初始化（指定内容）

动态初始化数组的格式：
数据类型[] 数组名称 = new 数据类型[数组长度];


直接打印数组名称，得到的是数组对应的：内存地址哈希值。
二进制：01
十进制：0123456789
16进制：0123456789abcdef

访问数组元素的格式：数组名称[索引值]
索引值：就是一个int数字，代表数组当中元素的编号。
【注意】索引值从0开始，一直到“数组的长度-1”为止。


默认值
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
如果是整数类型，那么默认为0；
如果是浮点类型，那么默认为0.0；
如果是字符类型，那么默认为'\u0000'；
如果是布尔类型，那么默认为false；
如果是引用类型，那么默认为null。
 */
public class Demo14Array1 {

    public static void main(String[] args) {
        // 创建一个数组，里面可以存放300个int数据
        int[] arrayA = new int[300];

        // 创建一个数组，能存放10个double类型的数据
        double[] arrayB = new double[10];

        // 创建一个数组，能存放5个字符串
        String[] arrayC = new String[5];


        // 直接创建一个数组，里面装的全都是int数字，具体为：5、15、25
        int[] arrayD = new int[] { 5, 15, 25, 40 };

        // 创建一个数组，用来装字符串："Hello"、"World"、"Java"
        String[] arrayE = new String[] { "Hello", "World", "Java" };

        // 省略格式的静态初始化
        int[] arrayF = { 10, 20, 30 };

        // 静态初始化的标准格式，可以拆分成为两个步骤
        int[] arrayG;
        arrayG = new int[] { 11, 21, 31 };

        // 动态初始化也可以拆分成为两个步骤
        int[] arrayH;
        arrayH = new int[5];


        // 静态初始化的省略格式
        int[] array = { 10, 20, 30 };

        System.out.println(array); // [I@75412c2f

        // 直接打印数组当中的元素
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30



        // 动态初始化一个数组
        int[] arrayI = new int[3];

        System.out.println(arrayI); // 内存地址值
        System.out.println(arrayI[0]); // 0
        System.out.println(arrayI[1]); // 0
    }

}

