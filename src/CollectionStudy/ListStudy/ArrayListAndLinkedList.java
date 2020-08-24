package CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        //创建集合对象ArrayList
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        //遍历三种方式
        //测试时间
        long start = System.currentTimeMillis();
        for(String s : array){
            System.out.println(s);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
        System.out.println("-------");

        for(int i = 0;i<array.size();i++){
            System.out.println(array.get(i));
        }
        System.out.println("-------");

        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------");
        //创建集合对象LinkedList
        LinkedList<String> linked = new LinkedList<String>();
        linked.add("Rorschach");
        linked.add("Allen");
        linked.add("Eric");
        //遍历
        //测试时间
        long start2  = System.currentTimeMillis();
        for(String s : linked){
            System.out.println(s);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("共耗时"+(end2-start2)+"毫秒");
    }
}
