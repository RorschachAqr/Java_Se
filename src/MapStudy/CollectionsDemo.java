package MapStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();
        //添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        //调用排序方法，自然顺序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("--------");
        //反转
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("--------");
        //随即置换
        Collections.shuffle(list);
        System.out.println(list);
    }
}
