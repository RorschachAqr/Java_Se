package interfaceStudy2;

//public class interImpl implements inter{
public class interImpl extends Object implements inter{
    public interImpl() {
        super(); // 继承Object类
    }
    @Override
    public void show(){
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}
