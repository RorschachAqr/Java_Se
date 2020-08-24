package MapStudy.HashMapCase3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
统计字符串中每个字符出现的次数:
例：键盘录入"aababcabcdabcde"
    控制台输出："a(5)b(4)c(3)d(2)e(1)"

 */
public class Demo {
    public static void main(String[] args) {
       //键盘录入字符
       Scanner sc = new Scanner(System.in);
       System.out.println("输入一个字符串");
       String line = sc.nextLine();
       //创建HashMap集合
       HashMap<Character,Integer> hm = new HashMap<>();
       //遍历字符串
        for(int i = 0; i < line.length();i++){
            char key = line.charAt(i);
            //拿到的每一个字符作为键到HashMap中去找对应的值，看返回值
            Integer value = hm.get(key);
            //如果返回的是null，说明在HashMap中不存在，就把该字符作为建，1作为值存储
            if(value == null){
                hm.put(key,1);//自动装箱
            }else{
                value++; //自动拆箱
                hm.put(key,value);
            }
        }
        //遍历HashMap集合，得到建和值按要求进行拼接
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for(Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
