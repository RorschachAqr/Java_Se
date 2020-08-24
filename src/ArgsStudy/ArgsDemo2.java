package ArgsStudy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //public static <T> List<T> asList(T...a)返回有指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");
        //list.add("javaEE");//UnsupportedOperationException
        //list.remove("world");//UnsupportedOperationException
        //add和remove修改了元组长度，所以不行
        list.set(1,"javaee");
        System.out.println(list);
        System.out.println("--------");

        //public static <E> List<E> of(E...element)返回包含任意数量元素的不可变列表
        List<String> list2 = List.of("java", "world", "hello");
        //list2.add("javaEE");//UnsupportedOperationException
        //list2.remove("world");//UnsupportedOperationException
        //list2.set(1,"javaee");//UnsupportedOperationException
        //List.of()方法增删改减都不行
        System.out.println(list);
        System.out.println("--------");
        //public static <E> Set<E> of(E...element)返回一个包含任意数量元素的不可变集合
        Set<String> set = Set.of("hello", "world", "java");
        //set.add("hello");//UnsupportedOperationException
        //set.remove("hello");//UnsupportedOperationException
        //set.set set集合没有带索引的set方法
        System.out.println(set);
    }
}
