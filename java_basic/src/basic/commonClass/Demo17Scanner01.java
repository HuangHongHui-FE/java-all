package basic.commonClass;

import java.util.Scanner;
/*
Scanner��Ĺ��ܣ�����ʵ�ּ����������ݣ��������С�
 */
public class Demo17Scanner01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("�������һ�����֣�");
        int num = sc.nextInt();
        System.out.println("�����int�����ǣ�" + num);


        System.out.println("�������һ���ַ�����");
        String str = sc.next();
        System.out.println("������ַ����ǣ�" + str);
    }

}
