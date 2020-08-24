package CollectionStudy.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //不带重复元素
        //set是个接口，只能找子类实现
        //HashSet,对集合的迭代顺序不作任何保证
        Set<String> s = new HashSet<String>();

        //添加元素
        s.add("hello");
        s.add("world");
        s.add("java");

        s.add("world"); //不包含重复元素
        //遍历
        for(String s1 : s){
            System.out.println(s1);
        }
        /*
        world
        java
        hello
         */

    }
}
