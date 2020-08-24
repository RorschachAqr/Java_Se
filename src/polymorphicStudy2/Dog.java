package polymorphicStudy2;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗吃东西");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
