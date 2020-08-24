package APIStudy;

import java.util.Arrays;

//toString(int[] a)
//sort(int[] a)
public class ArraysStudy {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后"+Arrays.toString(arr));
    }
}
