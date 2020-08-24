package OuterInnerClassStudy2;

public class OuterDemo {
    public static void main(String[] args) {
        //创建内部类对象，调用方法
        //Outer.Inner i = new Outer().new Inner();
        //i.show();
        //一般用间接调用
        Outer o = new Outer();
        o.method();
    }
}
