package basic;

/*
����һ�������ĸ�ʽ��

�������Ƶ���������ͱ���һ����ʹ��С�շ塣
�����壺Ҳ���Ǵ����ŵ��п��԰�����������䡣

ע�����
2. �����Ķ��岻�ܲ���Ƕ�װ�����ϵ��
*/
public class Demo08Method {

    public static void main(String[] args) {
        cook(); // ���ó��ӵķ���
        sum(1, 2);

        calculate(1, 2, 3);
    }

    // ����
    public static void cook() {
        System.out.println("ϴ��");
        System.out.println("�в�");
        System.out.println("����");
        System.out.println("װ��");
    }

    // params
    public static int sum(int a, int b) {
        System.out.println("sum����ִ������");
        int result = a + b;
        return result;
    }


    // ����ֵ����
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c; // �ܺ�
        int avg = sum / 3; // ƽ����

        int[] array = { sum, avg };
        System.out.println("calculate�����ڲ������ǣ�"+ array);
        return array;
    }
}