package APIStudy;

public class IntToString {
    public static void main(String[] args) {
        //int to String
        int a = 100;

        //第一种方法
        String s1 = ""+ a;
        System.out.println(s1);

        //第二种方法
        //public static String valueOf(int a)
        String s2 = String.valueOf(a);
        System.out.println(s2);
        System.out.println("-------");

        //String to int
        String s = "100";

        //第一种方法
        //String -- Integer --int
        Integer i = Integer.valueOf(s);
        int i2 = i.intValue();
        System.out.println(i2);

        //第二种方法
        int i3 = Integer.parseInt(s);
        System.out.println(i3);
    }
}
