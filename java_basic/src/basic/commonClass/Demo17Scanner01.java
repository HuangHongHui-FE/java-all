package basic.commonClass;

import java.util.Scanner;
/*
Scanner类的功能：可以实现键盘输入数据，到程序当中。
 */
public class Demo17Scanner01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num = sc.nextInt();
        System.out.println("输入的int数字是：" + num);


        System.out.println("请输入第一个字符串：");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }

}
