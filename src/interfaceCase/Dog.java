package interfaceCase;

public class Dog extends Animal implements Inter{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    @Override
    public void Jumping() {
        System.out.println("跳的矮");
    }
}
