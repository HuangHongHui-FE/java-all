package basic.commonClass;

import java.util.Scanner;

public class Demo17Scanner02 {

    public static void main(String[] args) {
        // ��ͨʹ�÷�ʽ
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // ��������ķ�ʽ
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("������ǣ�" + num);

        // ʹ��һ��д���������
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // ʹ���������������д���
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();


        //3.����Scanner�����ط���
        System.out.println("���������������");
        String name = sc.next();
        System.out.println(name);

        System.out.println("��������ķ��䣺");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("������������أ�");
        double weight = sc.nextDouble();
        System.out.println(weight);

        System.out.println("���Ƿ����������أ�(true/false)");
        boolean isLove = sc.nextBoolean();
        System.out.println(isLove);

        //����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ�ܻ�ȡһ���ַ���
        System.out.println("����������Ա�(��/Ů)");
        String gender = sc.next();//"��"
        char genderChar = gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
        System.out.println(genderChar);
        System.out.println("������ǣ�" + num);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }

}

