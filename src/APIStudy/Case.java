package APIStudy;

import java.util.Arrays;

public class Case {
    public static void main(String[] args) {
        //定义字符串
        String s = "91 27 46 38 50";

        //字符串数字存储到int类型数组中
        String[] sa = s.split(" ");

        int[] arr = new int[sa.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sa[i]);
        }
        //for(int i = 0; i<arr.length;i++){
        //System.out.println(arr[i]);
        //}
        //排序
        Arrays.sort(arr);
        //把排序后的int数组重得元素进行拼接得到一个字符串，拼接用StringBuilder实现
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        //输出结果
        System.out.println("result:" + result);
    }
}