package basic.commonClass;
/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class Demo20String03 {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "asdasfeutrvauevbueyvb".length();
        System.out.println("字符串的长度是：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3); // HelloWorld，新的字符串

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1
        System.out.println("================");


        // 字符串截取
        String str4 = str1.substring(2);
        System.out.println(str4); // World，新字符串

        String str5 = str1.substring(2, 3);
        System.out.println(str5);

        // 转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5

        // 转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 字符串的内容替换
        String str6 = "How do you do?";
        String str7 = str1.replace("o", "*");
        System.out.println(str6); // How do you do?
        System.out.println(str7); // H*w d* y*u d*?

        // split
        String str8 = "aaa,bbb,ccc";
        String[] array1 = str8.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

}
