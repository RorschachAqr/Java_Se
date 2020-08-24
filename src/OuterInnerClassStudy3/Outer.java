package OuterInnerClassStudy3;

public class Outer {
    //局部内部类
    private int num = 10;

    //局部内部类直接用class
    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
