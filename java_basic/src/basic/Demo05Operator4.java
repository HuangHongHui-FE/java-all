package basic;

/*
һԪ�������ֻ��Ҫһ�����ݾͿ��Խ��в���������������磺ȡ��!������++���Լ�--
��Ԫ���������Ҫ�������ݲſ��Խ��в���������������磺�ӷ�+����ֵ=
��Ԫ���������Ҫ�������ݲſ��Խ��в������������

��ʽ��
�������� �������� = �����ж� ? ���ʽA : ���ʽB;

*/
public class Demo05Operator4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b; // ���ֵ�ı���
        System.out.println("���ֵ��" + max); // 20

        // int result = 3 > 4 ? 2.5 : 10; // ����д����

        System.out.println(a > b ? a : b); // ��ȷд����

        // a > b ? a : b; // ����д����
    }
}
