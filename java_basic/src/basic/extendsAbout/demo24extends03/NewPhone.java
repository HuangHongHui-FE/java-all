package basic.extendsAbout.demo24extends03;

// 定义一个新手机，使用老手机作为父类
public class NewPhone extends Phone {

//    @Override：写在方法前面，用来检测是不是有效的正确覆盖重写。
//    这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
    @Override
    public void show() {
        super.show(); // 把父类的show方法拿过来重复利用
        // 自己子类再来添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
