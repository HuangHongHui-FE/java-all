package basic.interfaceAbout.demo25;

/*
1. 接口的默认方法，可以通过接口实现类对象，直接调用。
2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class Demo25Interface02 {

    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        // 调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();
        System.out.println("==========");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault(); // 实现类B覆盖重写了接口的默认方法
    }

}
