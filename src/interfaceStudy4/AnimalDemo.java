package interfaceStudy4;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象并调用方法
        AnimalOperator ao = new AnimalOperator();
        // ao.useAnimal(需要animal对象，但是抽象类对象需要用子类)
        Cat c = new Cat();
        ao.useAnimal(c);

        //Animal c2 = new Cat();
        //ao.getAnimal();

        Animal a2 = ao.getAnimal();
        a2.eat();
    }
}
