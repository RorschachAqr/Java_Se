package CollectionStudy;

import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        //创建集合对象
        //TreeSet存储的是引用类型，不是基本类型,用int的包装类型Integer
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        //继承自set，不包含重复元素
        ts.add(30);
        //遍历集合，自然排序进行排序
        for(int i : ts){
            System.out.println(i);
        }
    }
}
