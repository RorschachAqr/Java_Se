package APIStudy;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();

        //getTime()
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365+"年");

        System.out.println(d);

        long time = 1000*60*60;
        d.setTime(time);
        System.out.println(d);
    }
}
