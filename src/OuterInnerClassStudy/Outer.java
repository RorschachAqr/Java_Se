package OuterInnerClassStudy;
/*
外部类要访问内部类必须要创建对象
 */
public class Outer {
    private int age = 10;

    public void showOuter(){
        Inner i = new Inner();
        i.showInner();
    }

    public class Inner{
        /*
        内部类可以访问外部类方法，包含私有
         */
        public void showInner() {
            System.out.println(age);
        }
    }
}
