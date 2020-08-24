package polymorphicStudy;

public class Cat extends Animal{

    public int age = 20;
    public int weight = 10;

    @Override
    public void eat(){
        //super.eat();
        System.out.println("猫吃东西");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }

}
