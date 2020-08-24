package APIStudy;
/*
需求：获取任意一年的二月有多少天
思路：
1：键盘录入年份
2：设置日历对象的年月日
 年：来自于键盘输入
 月：设置为三月，月份从0开始，所以设置的是2
 日：设置为1
3：3月1日往前推一天就是2月最后一天
4：获取这一天的输出
 */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份: ");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);

        //获取输出
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年的二月份有"+date+"天");
    }
}
