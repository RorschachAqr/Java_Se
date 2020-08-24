package polymorphicCase;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("汤姆");
        c.setAge(2);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();


        Animal d = new Dog();
        d.setName("杰瑞");
        d.setAge(2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
