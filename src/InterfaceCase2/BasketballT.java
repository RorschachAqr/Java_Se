package InterfaceCase2;

public class BasketballT extends Trainer{
    public BasketballT() {
    }

    public BasketballT(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教人");
    }
}
