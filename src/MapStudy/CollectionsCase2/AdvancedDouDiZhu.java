package MapStudy.CollectionsCase2;
/*
用之前学过的集合实现洗牌，发牌和看牌并对牌进行排序
实操：1.创建HashMap集合，键是编号，值是牌
      2.创建ArrayList，存储编号
      3.创建花色数组和点数数组
      4.从0开始往HashMap里面存储编号，并存储对应的牌，同时往ArrayList里面存储编号
      5.洗牌，用Collections的shuffle方法实现
      6.发牌（发的是编号）用TreeSet集合接收以保证编号是排序的
      7.定义看牌方法（遍历TreeSet集合，获取编号，到HashMap找对应的值）
      8.调用看牌方法
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class AdvancedDouDiZhu {
    public static void main(String[] args) {
        //创建花色数组
        HashMap<Integer,String> hm = new HashMap<>();
        //创建ArrayList用于存储编号
        ArrayList<Integer> array = new ArrayList<>();
        //创建花色数组和点数数组
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};//从3开始是因为斗地主里面3是最小的
        //从0开始往HashMap里面存储编号和牌，同时往ArrayList里面存储编号
        int index = 0;
        for(String number:numbers){
            for(String color:colors){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        //洗牌，洗的是编号
        Collections.shuffle(array);

        //发牌，用TreeSet
        TreeSet<Integer> Allen = new TreeSet<>();
        TreeSet<Integer> Rorschach = new TreeSet<>();
        TreeSet<Integer> Jimmy = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for(int i = 0; i < array.size(); i++){
            int x = array.get(i);
            if(i>=array.size()-3){
                dipai.add(x);
            } else if (i%3==0){
                Allen.add(x);
            } else if (i%3==1){
                Rorschach.add(x);
            } else if (i%3==2){
                Jimmy.add(x);
            }
        }
        //调用看牌方法
        lookPoker("Allen",Allen,hm);
        lookPoker("Rorschach",Rorschach,hm);
        lookPoker("Jimmy",Jimmy,hm);
        lookPoker("底牌",dipai,hm);
    }
    //定义方法看牌
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌是： ");
        for(Integer key : ts){
            String poker = hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
