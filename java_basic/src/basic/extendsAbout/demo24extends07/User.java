package basic.extendsAbout.demo24extends07;

public class User {

    private String name; // ����
    private int money; // ��Ҳ���ǵ�ǰ�û�ӵ�е�Ǯ��

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // չʾһ�µ�ǰ�û��ж���Ǯ
    public void show() {
        System.out.println("�ҽУ�" + name + "�����ж���Ǯ��" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
