package basic.module;

/*
��������������Person������ʱ���޷���ֹ���������ֵ�����ý�����
�����������private�ؼ��ֽ���Ҫ�����ĳ�Ա�����������Ρ�

һ��ʹ����private�������Σ���ô���൱����Ȼ����������ʡ�
���ǣ������˱��෶Χ֮��Ͳ�����ֱ�ӷ����ˡ�

��ӷ���private��Ա���������Ƕ���һ�Զ�Getter/Setter����

�����setXxx������getXxx��������
����Getter��˵�������в���������ֵ���ͺͳ�Ա������Ӧ��
����Setter��˵�������з���ֵ���������ͺͳ�Ա������Ӧ��


��ͨ��˭���õķ�����˭����this����
 */
public class Person {

    String name; // ����
    private int age; // ����

    public void show() {
        System.out.println("�ҽУ�" + name + "�����䣺" + age);
    }

    // �����Ա������ר��������age��������
    public void setAge(int num) {
        if (num < 100 && num >= 9) { // ����Ǻ������
            age = num;
        } else {
            System.out.println("���ݲ�����");
        }
    }

    // �����Ա������ר��˽���ȡage������
    public int getAge() {
        return age;
    }

//    thisָ��
    public void sayHello(String name) {
        System.out.println(name + "����á�����" + this.name);
        System.out.println(this);
    }
}

