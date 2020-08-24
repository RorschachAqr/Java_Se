package ArgsStudy;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
    /*
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

     */
    //上面的方法太麻烦
    public static int sum(int...a){ //a本质上是个数组
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

}
