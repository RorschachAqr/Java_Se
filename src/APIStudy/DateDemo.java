package APIStudy;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Date()构造方法
        Date d1 = new Date();
        //重写了toString方法
        System.out.println(d1);

        //Date(long a)构造方法，从标准时间启示的毫秒数
        long date  = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
