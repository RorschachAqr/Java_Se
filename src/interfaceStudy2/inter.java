package interfaceStudy2;

public interface inter {
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;
    // 接口里的变量默认用public static final 修饰
    // public static final int num3 == int num3
    // public Inter(){} 接口不能有构造方法
    // public void show(){};不能有方法
    // 成员方法默认带 public abstract
    void show();
    void method();
}
