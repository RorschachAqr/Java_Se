package GenericStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericStudy {
    public static void main(String[] args) {
        //创建集合对象
        //使用泛型转换
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        //c.add(100);

        //遍历集合
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
           // Object obj = i.next();
            //System.out.println(obj);
            //变成String类型
            //String s = (String)i.next();
            //System.out.println(s);
            String s = it.next();
            System.out.println(s);
        }
    }
}
