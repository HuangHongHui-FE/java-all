package basic.module;

/*
���췽����ר��������������ķ�����������ͨ���ؼ���new����������ʱ����ʵ�����ڵ��ù��췽����

ע�����
1. ���췽�������Ʊ�������ڵ���������ȫһ����������СдҲҪһ��
2. ���췽����Ҫд����ֵ���ͣ���void����д
3. ���췽������returnһ������ķ���ֵ
4. ���û�б�д�κι��췽������ô����������Ĭ������һ�����췽����û�в�����������ʲô���鶼������
public Student() {}
5. һ����д������һ�����췽������ô���������������͡�
6. ���췽��Ҳ�ǿ��Խ������صġ�
���أ�����������ͬ�������б�ͬ��
 */
public class Student {

    // ��Ա����
    private String name;
    private int age;

    // �޲����Ĺ��췽��
    public Student() {
        System.out.println("�޲ι��췽��ִ������");
    }

    // ȫ�����Ĺ��췽��
    public Student(String name, int age) {
        System.out.println("ȫ�ι��췽��ִ������");
        this.name = name;
        this.age = age;
    }

    // Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
