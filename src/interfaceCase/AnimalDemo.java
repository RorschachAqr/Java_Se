package interfaceCase;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat("杰瑞",2);
        Animal d= new Dog("汤姆",3);

        System.out.println(c.getName()+","+c.getAge());
        Inter ci = new Cat();
        ci.eat();
        ci.Jumping();

        System.out.println(d.getName()+","+d.getAge());
        Inter di = new Dog();
        di.eat();
        di.Jumping();

    }

}
