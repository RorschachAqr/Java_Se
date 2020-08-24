package polymorphicStudy;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
        //System.out.println(a.weight);
        a.eat();
        //a.playGame();
    }
}
