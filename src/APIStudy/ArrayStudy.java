package APIStudy;

public class ArrayStudy {
    public static void main(String[] args) {

        //定义一个数组
        int[] a = new int[]{24,69,80,57,13};
        System.out.println("排序前"+arrayToString(a));

        //第一次比较
        for(int i = 0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println("第一次比较"+arrayToString(a));

        //第二次比较
        for(int i = 0;i<a.length-1-1;i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println("第二次比较"+arrayToString(a));

        //第三次比较
        for(int i = 0;i<a.length-1-1-1;i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println("第三次比较"+arrayToString(a));

        //第四次比较
        for(int i = 0;i<a.length-1-1-1-1;i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println("第四次比较"+arrayToString(a));

        //代码优化
        for(int x = 0;x<a.length-1;x++){
            for(int i = 0;i<a.length-1-x;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        System.out.println("排序后"+arrayToString(a));
    }

    //把数组中的元素按规则组成一个字符串
    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
