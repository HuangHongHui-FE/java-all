package basic.module;

/*
ͨ������£�һ���ಢ����ֱ��ʹ�ã���Ҫ�����ഴ��һ�����󣬲���ʹ�á�

1. ������Ҳ����ָ����Ҫʹ�õ��࣬��ʲôλ�á�
import ������.������;

���ں͵�ǰ������ͬһ���������������ʡ�Ե�����䲻д��

2. ��������ʽ��
������ ������ = new ������();
StudentPro stu = new StudentPro();

3. ʹ�ã���Ϊ���������
ʹ�ó�Ա������������.��Ա������
ʹ�ó�Ա������������.��Ա������(����)
 */
public class Demo16Module {

    public static void main(String[] args) {
        // 1. ������
        // ����Ҫʹ�õ�StudentPro�࣬�����Լ�Demo02StudentProλ��ͬһ�����£�����ʡ�Ե�����䲻д

        // 2. ��������ʽ��
        // ������ ������ = new ������();
        // ����StudentPro�࣬������һ����Ϊstu�Ķ���
        StudentPro stu = new StudentPro();

        // 3. ʹ�����еĳ�Ա��������ʽ��
        // ������.��Ա������
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("=============");

        // �ı�����еĳ�Ա������ֵ����
        // ���Ҳ���ַ�������ֵ����stu�����е�name��Ա����
        stu.name = "����ӱ";
        stu.age = 18;
        System.out.println(stu.name); // ����ӱ
        System.out.println(stu.age); // 18
        System.out.println("=============");

        // 4. ʹ�ö���ĳ�Ա��������ʽ��
        // ������.��Ա������()
        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println("=============");


        // ���δ���ַ
        method(stu);
        System.out.println("=============");



        StudentPro one = getStudent();
        System.out.println(one.name);
    }

    public static void method(StudentPro param) {
        System.out.println(param.name);
        System.out.println(param.age);
    }


    public static StudentPro getStudent() {
        StudentPro one = new StudentPro();
        one.name = "ƻ��";
        one.age = 8388;
        return one;
    }


}

