package CollectionStudy.ListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("Rorschach");
        list.add("Allen");
        list.add("Eric");
        list.add("Eric");//可重复
        //输出对象
        //System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
