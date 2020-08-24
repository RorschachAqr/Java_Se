package MapStudy.CollectionsCase2;
/*
模拟出斗地主中洗牌，发牌，看牌的过程
实操：1.创建牌盒，也就是定义一个集合对象，用ArrayList实现
      2.往牌盒里面装牌
      3.洗牌，用Collections里面的shuffle实现
      4.发牌，遍历集合，给三个玩家发牌
      5.看牌，三个玩家分别遍历自己的牌
 */

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhuDemo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> array = new ArrayList<>();
        //往牌盒里面装牌
        /*
          ♦2，♦3...♦A
          ♣2，♣3...♣A
          ♥2.......♥A
          ♠2.......♠A
          小王，大王，54张牌
         */
        //定义花色数组
        String[] colors = {"♦","♣","♥","♠"};
        //定义点数数组
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //拼接花色和点数
        for(String color : colors){
            for(String number : numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");
        //统计牌数
        /*
        int count = 0;
        for(int i = 0; i < colors.length; i ++){
            for(int j = 0; j<numbers.length; j ++){
                count++;
            }
        }
        System.out.println(count);
         */
         //洗牌
        Collections.shuffle(array);
        //System.out.println(array);
        //发牌,给三个玩家发牌
        ArrayList<String> Allen = new ArrayList<>();
        ArrayList<String> Rorschach = new ArrayList<>();
        ArrayList<String> Jimmy = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //发牌
        for(int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
           if(i>=array.size()-3){
                dipai.add(poker);
                //三个玩家对3取余
           }else if(i%3==0){
               Allen.add(poker);
           }else if(i%3 == 1){
               Rorschach.add(poker);
           }else if(i%3 == 2){
               Jimmy.add(poker);
           }
        }
        lookPoker("Allen",Allen);
        lookPoker("Rorschach",Rorschach);
        lookPoker("Jimmy",Jimmy);
        lookPoker("底牌",dipai);
    }
    //看牌的方法
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name+"的牌是: ");
        for(String poker : array){
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
