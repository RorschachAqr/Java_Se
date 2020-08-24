package OuterInnerClassStudy4;

/*
格式：new 类名或者接口名（）{
      重写方法
      };
 */
public class Outer {
    public void method() {
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };    //对象调用了show（）方法
        int a = 0;
        while(a<5){
            i.show();
            a++;
        }
    }
}
