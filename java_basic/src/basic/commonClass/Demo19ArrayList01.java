package basic.commonClass;

import java.util.ArrayList;
//���ϣ���򼯺�ArrayList���д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ��
//��������    ��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
//byte        Byte
//short       Short
//int         Integer     �����⡿
//long        Long
//float       Float
//double      Double
//char        Character   �����⡿
//boolean     Boolean
//
//��JDK 1.5+��ʼ��֧���Զ�װ�䡢�Զ����䡣
//
//�Զ�װ�䣺�������� --> ��װ����
//�Զ����䣺��װ���� --> ��������
public class Demo19ArrayList01 {
    public static void main(String[] args) {
        // ������һ��ArrayList���ϣ����ϵ�������list������װ��ȫ����String�ַ������͵�����
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // �õ�add������
        boolean res = list.add("����ӱ");
        System.out.println(res);  // ��ӵĶ����Ƿ�ɹ�
        System.out.println(list); // [����ӱ]

        list.add("�����Ȱ�");
        list.add("��ԲԲ");
        list.add("����͢");
        list.add("��С�");
        list.add("������");
        //        list.add(100); // ����д������Ϊ������ʱ������ŷ����Ѿ�˵�����ַ�������ӽ�ȥ��Ԫ�ؾͱ��붼���ַ�������
        System.out.println(list);

        // �Ӽ����л�ȡԪ�أ�get������ֵ��0��ʼ
        String name = list.get(1);
        System.out.println("��1������λ�ã�" + name);

        // �Ӽ�����ɾ��Ԫ�أ�remove������ֵ��0��ʼ��
        String whoRemoved = list.remove(3);
        System.out.println("��ɾ�������ǣ�" + whoRemoved);

        // ��ȡ���ϵĳ��ȳߴ磬Ҳ��������Ԫ�صĸ���
        int size = list.size();
        System.out.println("���ϵĳ����ǣ�" + size);

        // ��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
