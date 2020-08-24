package CollectionStudy;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //添加元素
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("world");
        //遍历集合
        for(String s : lhs){
            System.out.println(s);
        }
    }
}
