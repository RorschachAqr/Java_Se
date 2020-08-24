package InterfaceCase2;

public class TabletennisT extends Trainer implements English{
    public TabletennisT() {
    }

    public TabletennisT(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
