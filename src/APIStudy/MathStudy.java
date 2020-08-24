package APIStudy;
//static修饰的方法只能访问static修饰的方法和变量
//非static修饰的方法能访问非static和static修饰的方法和变量

public class MathStudy {
    public static int a = -20;
    public static double b = 15.5;
    public static float c = 16.5f;
    public static int d = 15;

    public static void main(String[] args) {
          abs(a); //20
          ceil(b); //16.0
          floor(b); //15.0
          round(c); //17
          max(a,d); //15
          min(a,d); //-20

    }
     public static void abs(int a){
         System.out.println(Math.abs(a));
     }

     public static void ceil(double a){
         System.out.println(Math.ceil(a));
     }

     public static void floor(double a){
         System.out.println(Math.floor(a));
     }

     public static void round(float a){
         System.out.println(Math.round(a));
     }

     public static void max(int a , int b){
         System.out.println(Math.max(a,b));
     }

     public static void min(int a, int b){
         System.out.println(Math.min(a,b));
     }

     public static void pow(double a , double b){
         System.out.println(Math.pow(a,b));
     }
}
