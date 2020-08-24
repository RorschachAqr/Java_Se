package InterfaceCase2;

public class Demo {
    public static void main(String[] args) {

        BasketballA ba = new BasketballA("芙",20);
        BasketballT bt = new BasketballT("吴",30);
        TabletennisA ta= new TabletennisA("蜀",21);
        TabletennisT tt = new TabletennisT("魏",31);

        System.out.println(ba.getName()+","+ba.getAge());
        ba.eat();
        ba.study();

        System.out.println(bt.getName()+","+bt.getAge());
        bt.eat();
        bt.teach();

        System.out.println(ta.getName()+","+ta.getAge());
        ta.eat();
        ta.study();
        ta.learnEnglish();

        System.out.println(tt.getName()+","+tt.getAge());
        tt.eat();
        tt.teach();
        tt.learnEnglish();

    }
}
