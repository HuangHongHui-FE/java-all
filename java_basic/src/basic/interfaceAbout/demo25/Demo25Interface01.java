package basic.interfaceAbout.demo25;

/*
�ӿھ��Ƕ����Ĺ����淶��
�ӿ���һ�������������ͣ�����Ҫ�����ݾ������еģ����󷽷���

��ע�������˹ؼ���interface֮�󣬱������ɵ��ֽ����ļ���Ȼ�ǣ�.java --> .class��

�����Java 7����ô�ӿ��п��԰����������У�
1. ����
2. ���󷽷�

�����Java 8�������Զ�������У�
3. Ĭ�Ϸ���
4. ��̬����

�����Java 9�������Զ�������У�
5. ˽�з���

�ӿ�ʹ�ò��裺
1. �ӿڲ���ֱ��ʹ�ã�������һ����ʵ���ࡱ����ʵ�֡��ýӿڡ�
��ʽ��
public class ʵ�������� implements �ӿ����� {
    // ...
}
2. �ӿڵ�ʵ������븲����д��ʵ�֣��ӿ������еĳ��󷽷���
ʵ�֣�ȥ��abstract�ؼ��֣����Ϸ���������š�
3. ����ʵ����Ķ��󣬽���ʹ�á�

ע�����
���ʵ���ಢû�и�����д�ӿ������еĳ��󷽷�����ô���ʵ�����Լ��ͱ����ǳ����ࡣ
 */
public class Demo25Interface01 {

    public static void main(String[] args) {
        // ����д��������ֱ��new�ӿڶ���ʹ�á�
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        // ����ʵ����Ķ���ʹ��
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }

}
