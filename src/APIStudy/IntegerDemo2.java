package APIStudy;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //装箱，基本->包装类
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii = 100;

        //拆箱，包装类->基本
        //ii += 200；(自动拆箱）
        ii = ii.intValue() + 200;
        System.out.println(ii);

        Integer iii = null;
        if (iii != null) {
            iii += 300; //NullPointerException
        }
    }
}
