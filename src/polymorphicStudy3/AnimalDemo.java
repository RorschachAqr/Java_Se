package polymorphicStudy3;

public class AnimalDemo {
    public static void main(String[] args) {
        /*
        向上转型
        从子到父
        父类引用指向子类对象
         */
        Animal a = new Cat(); //向上转型
        a.eat();
        //a.playGame(); 编译看左边，Animal里面没有playGame方法

        //创建Cat类对象
        /*Cat c =  new Cat();
        c.eat();
        c.playGame();

         */

        /* 向下转型
        从父到子
        父类引用转为子类对象
         */
        Cat c = (Cat)a;
        c.eat();
        c.playGame();
        Dog d = (Dog)a;
        //报错classCastException
        Cat cc= (Cat)a;
    }
}
