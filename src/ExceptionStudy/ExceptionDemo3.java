package ExceptionStudy;
/*
try{
      可能出现异常的代码；
   } catch（异常类名 变量名） {
      异常的处理代码；
   }
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("Start");
        method();
        System.out.println("End");
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){ //e是一个对象，是对象就可以调用方法
            //System.out.println("您访问的信息不存在");
            //e.printStackTrace();
            /*
            Start
            3
            End
             */
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            /*
               Start
               java.lang.ArrayIndexOutOfBoundsException: 3
               End
             */

        }
    }
}
