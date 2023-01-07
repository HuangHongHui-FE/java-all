package basic.commonClass;

import java.util.Random;

// 获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
// 获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
public class Demo18Random01 {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(3);  // 范围实际上是0~2
        System.out.println("随机整数是：" + num);
    }
}
