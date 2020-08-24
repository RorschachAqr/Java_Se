package CollectionStudy;

import java.util.ArrayList;
import java.util.List;

public class AdvancedForLoop {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for(int i : a){
            System.out.println(i);
        }
        System.out.println("---------");

        String[] arr =  {"hello","world","java"};
        for(String s : arr){
            System.out.println(s);
        }
        System.out.println("---------");

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(String s : list){
            System.out.println(s);
        }
        System.out.println("---------");

        //验证内部是不是一个迭代器
        /*for(String s : list){
            if(s.equals("world")){
                list.add("javaee");//ConcurrentModificationException
            }
        }

         */
    }
}
