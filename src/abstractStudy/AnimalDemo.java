package abstractStudy;

public class AnimalDemo {
    public static void main(String[] args) {
        /*Animal a = new Animal();
        a.eat();
        抽象类不能创建对象
         */
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
