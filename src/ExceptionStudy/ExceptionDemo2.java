package ExceptionStudy;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Start");
        method();
        System.out.println("End");
    }

    public static void method(){
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
    /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
    at ExceptionStudy.ExceptionDemo2.method(ExceptionDemo2.java:12)
    at ExceptionStudy.ExceptionDemo2.main(ExceptionDemo2.java:6)
     */
}
