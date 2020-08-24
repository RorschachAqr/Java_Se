package CollectionStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorStudy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        //得到列表得到器
       /* ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }

        */
       /*
        System.out.println("---------");
        //n逆向遍历
        while(lit.hasPrevious()){
            String s2 = lit.previous();
            System.out.println(s2);
        }

        */
        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }

}
