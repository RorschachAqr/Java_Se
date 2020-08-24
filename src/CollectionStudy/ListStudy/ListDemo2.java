package CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
list特有方法：
   void add(int index, E element);
   E remove(int index);
   E set(int index, E element);
   E get(int index);
 */

public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("Rorschach");
        list.add("Allen");
        list.add("Eric");

        //void add
        list.add(2,"Jack"); //插入在2索引元素之前

        //E remove()
        list.remove(0);

        //E set(int index, E element
        list.set(1,"Tom");

        //E get()
        String s = list.get(1);
        System.out.println(s);

        //System.out.println(list);
        System.out.println(list);

        //遍历集合另一种方法
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
