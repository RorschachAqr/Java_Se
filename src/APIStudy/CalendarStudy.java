package APIStudy;

import java.util.Calendar;

public class CalendarStudy {
    public static void main(String[] args) {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        //System.out.println(rightNow);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年"+ month+"月"+date+"日");

        // add（int field，int amount）方法将指定时间量添加或减去给定的日历字段
        // 输出十年后的5天前
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");
        //修改日期
        c.set(2048,11,11);
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日");

    }
}
