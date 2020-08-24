package interfaceStudy2;

public class InterfaceDemo {
    public static void main(String[] args) {
        inter i = new interImpl();
        System.out.println(i.num);
        // 接口类的变量默认常量不能被修饰
        // i.num = 40;报错
        // final 修饰的变量不能重新赋值
        // i.num2 = 40;报错
        System.out.println(i.num2);
        i.show();
        i.method();
    }


}
