package OuterInnerClassStudy2;

public class Outer {
    //成员内部类
    private int num = 10;

    /*
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    // 一般创建内部类不是让给外面调用的，所以一般不用public
     */
    private class Inner{
       public void show(){
           System.out.println(num);
       }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
