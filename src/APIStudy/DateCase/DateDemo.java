package APIStudy.DateCase;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //测试 dateToString 方法
        Date d = new Date();
        String s1 = DateUtils.dateToString(d);
        // String s2 = DateUtils.dateToString("HH时mm分ss秒")；
        System.out.println(s1);

        //测试 stringToDate 方法
        String s2 = new String("2020年8月20日 12时20分20秒");
        Date d2 = DateUtils.stringToDate(s2);
        System.out.println(d2);
    }
}
