package basic.commonClass;
/*
String�������ȡ��صĳ��÷����У�

public int length()����ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
public String concat(String str)������ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
public char charAt(int index)����ȡָ������λ�õĵ����ַ�����������0��ʼ����
public int indexOf(String str)�����Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ��
 */
public class Demo20String03 {
    public static void main(String[] args) {
        // ��ȡ�ַ����ĳ���
        int length = "asdasfeutrvauevbueyvb".length();
        System.out.println("�ַ����ĳ����ǣ�" + length);

        // ƴ���ַ���
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3); // HelloWorld���µ��ַ���

        // ��ȡָ������λ�õĵ����ַ�
        char ch = "Hello".charAt(1);
        System.out.println("��1������λ�õ��ַ��ǣ�" + ch);

        // ���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("��һ������ֵ�ǣ�" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1
        System.out.println("================");


        // �ַ�����ȡ
        String str4 = str1.substring(2);
        System.out.println(str4); // World�����ַ���

        String str5 = str1.substring(2, 3);
        System.out.println(str5);

        // ת����Ϊ�ַ�����
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5

        // ת����Ϊ�ֽ�����
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // �ַ����������滻
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
