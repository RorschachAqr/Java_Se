package CollectionStudy.ListStudy;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("hello");
        linked.add("world");
        linked.add("java");
        //添加功能，addFirst(E e),addLast(E e)
        linked.addFirst("javase");
        linked.addLast("javaee");
        //getFirst(),getLast()
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
        //removeFirst(),removeLast()
        System.out.println(linked.removeFirst());
        System.out.println(linked.removeLast());
        System.out.println(linked);
    }
}
