package InterfaceCase2;

public class TabletennisA extends Athlete implements English{
    public TabletennisA() {
    }

    public TabletennisA(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("p乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }

    @Override
    public void learnEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
