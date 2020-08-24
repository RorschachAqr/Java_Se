package APIStudy;
/*
构造方法：
   public Integer(int value);根据int值创建Integer对象（过时）
   public Integer(String a);根据String值创建Integer对象（过时）

静态方法：
   public static Integer valueOf（int i）；返回指定的int值的Integer实例
   public static Integer valueOf（String a）；返回一个保存指定值的Integer对象String
 */

public class IntegerDemo {
    public static void main(String[] args) {
        //需求，判断一个数是不是在int范围内
        //public static final int MIN_VALUE;
        //public static final int MAX_VALUE;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //过时方法
        Integer i1 = new Integer(100);
        System.out.println(i1);
        Integer i2 = new Integer("100");
        //Integer i3 = new Integer("abc");
          //必须是数字的字符串,报错NumberFormatException
        System.out.println(i2);
        //拥有更好性能的方法
        Integer i3 = Integer.valueOf(101);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("102");
        System.out.println(i4);
    }
}
