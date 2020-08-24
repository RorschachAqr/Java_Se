package APIStudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) throws ParseException {
        //格式化 SimpleDateFormat.format()，从日期到字符串
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("------");

        //解析 SimpleDateFormat.parse(), 字符串到日期
        String s2 = "2020-08-09 12:27:35";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(s2);
        System.out.println(d2);
    }
}
