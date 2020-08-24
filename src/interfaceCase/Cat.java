package interfaceCase;

public class Cat extends Animal implements Inter{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void Jumping() {
        System.out.println("跳得高");
    }
}
