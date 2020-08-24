package CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
ConcurrentModificationException
 */

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("world")){
                list.add("javaee");
            }
        } 抛出异常ConcurrentModificationException

         */
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);

    }
}
