package abstractStudy2;

public abstract class Animal {
    private int age = 20;
    //final 修饰的是常量
    private final String city = "BeiJing";

    public Animal(){

    }

    public Animal(int age){

    }

    public void show(){
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}
