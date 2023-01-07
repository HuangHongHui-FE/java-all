package basic;

/*
如何获取数组的长度，格式：
数组名称.length

这将会得到一个int数字，代表数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo14Array2 {
    public static void main(String[] args) {
        int[] arrayB = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);


        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3


        System.out.println(arrayB);
        printArray(arrayB); // 传递进去的就是array当中保存的地址值
    }


    public static void printArray(int[] array) {
        System.out.println(array); // 地址值
    }
}
