package abstractStudy;

public abstract class Animal {
    /*
    public void eat(){
        System.out.println("吃东西");
    }
     */
    public abstract void eat();
    /*
    抽象类可以有非抽象方法，但是抽象方法必须在抽象类
     */
    public void sleep(){
        System.out.println("睡觉");
    }
}
