package basic.extendsAbout.demo24extends07;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("Ⱥ��", 100);

        Member one = new Member("��ԱA", 0);
        Member two = new Member("��ԱB", 0);
        Member three = new Member("��ԱC", 0);

        manager.show(); // 100
        one.show(); // 0
        two.show(); // 0
        three.show(); // 0
        System.out.println("===============");

        // Ⱥ���ܹ���20��Ǯ���ֳ�3�����
        ArrayList<Integer> redList = manager.send(20, 3);
        // ������ͨ��Ա�պ��
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show(); // 100-20=80
        // 6��6��8������ָ�������
        one.show();
        two.show();
        three.show();
    }

}
