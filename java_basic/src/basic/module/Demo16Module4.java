package basic.module;

public class Demo16Module4 {

    public static void main(String[] args) {
        Student stu1 = new Student(); // �޲ι���
        System.out.println("============");

        Student stu2 = new Student("����ӱ", 20); // ȫ�ι���
        System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
        stu2.setAge(21); // �ı�����
        System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());

    }

}
