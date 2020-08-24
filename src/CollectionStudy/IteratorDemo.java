package CollectionStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
E next();返回迭代器中的下一个元素
boolean hasNext(); 如果迭代器具有更多元素，则返回true
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //得到集合的迭代器
        Iterator<String> it = c.iterator();
        /*
           public Iterator<E> iterator(){
              return Itr();
           }

           private class Itr implements Iterator<E> {
           ...
           }
         */
        //E next();返回迭代中的下一个元素
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next()); //NoSuchElementException

         */
        /*
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }

         */
        //用while循环改进代码
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }

}
