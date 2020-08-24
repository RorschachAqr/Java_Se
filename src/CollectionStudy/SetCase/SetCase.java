package CollectionStudy.SetCase;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//用set存储10个不同的随机数
public class SetCase {
    public static void main(String[] args) {

        //创建set集合
        //Set<Integer> s = new HashSet<>();
        //要让随机数排序用TreeSet
        Set<Integer> s = new TreeSet<Integer>();
        //创建随机数
        Random r = new Random();
        //判断，循环
        while(s.size()<10){
            int num = r.nextInt(20)+1;
            s.add(num);
        }
        //遍历集合
        for(Integer i : s){
            System.out.println(i);
        }
    }
}
