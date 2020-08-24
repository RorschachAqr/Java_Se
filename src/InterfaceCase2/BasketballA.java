package InterfaceCase2;

public class BasketballA extends Athlete{
    public BasketballA() {
    }

    public BasketballA(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学员学习篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }
}
