package basic.commonClass;

import java.util.ArrayList;
//如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。
//基本类型    包装类（引用类型，包装类都位于java.lang包下）
//byte        Byte
//short       Short
//int         Integer     【特殊】
//long        Long
//float       Float
//double      Double
//char        Character   【特殊】
//boolean     Boolean
//
//从JDK 1.5+开始，支持自动装箱、自动拆箱。
//
//自动装箱：基本类型 --> 包装类型
//自动拆箱：包装类型 --> 基本类型
public class Demo19ArrayList01 {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 用到add方法。
        boolean res = list.add("赵丽颖");
        System.out.println(res);  // 添加的动作是否成功
        System.out.println(list); // [赵丽颖]

        list.add("迪丽热巴");
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        //        list.add(100); // 错误写法！因为创建的时候尖括号泛型已经说了是字符串，添加进去的元素就必须都是字符串才行
        System.out.println(list);

        // 从集合中获取元素：get。索引值从0开始
        String name = list.get(1);
        System.out.println("第1号索引位置：" + name);

        // 从集合中删除元素：remove。索引值从0开始。
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved);

        // 获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
