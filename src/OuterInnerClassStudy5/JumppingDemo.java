package OuterInnerClassStudy5;

public class JumppingDemo {
    public static void main(String[] args) {
        //创建接口操作类对象
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);
        Jumpping j2 = new Dog();
        jo.method(j2);
        System.out.println("--------");

        //用匿名内部类实现
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗跳高");
            }
        });
    }
}
