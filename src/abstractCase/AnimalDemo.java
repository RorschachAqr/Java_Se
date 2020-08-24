package abstractCase;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat("汤姆",2);
        Animal d = new Dog("杰瑞",3);

        //猫模块
        System.out.println(c.getName()+","+c.getAge());
        c.eat();

        //狗模块
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
