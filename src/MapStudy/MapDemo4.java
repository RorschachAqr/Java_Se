package MapStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        //创建集合对象
        Map<Integer,String> map = new HashMap<>();
        //添加元素
        map.put(1,"Allen");
        map.put(2,"Rorschach");
        map.put(3,"Eric");
        map.put(4,"Jimmy");
        //遍历方式一
        //增强for实现遍历
        Set<Integer> kSet = map.keySet();
        for(int k : kSet) {
            String value = map.get(k);
            System.out.println(k+","+value);
        }
        System.out.println("----------");
        //遍历方式二
        Set<Map.Entry<Integer,String>> kvSet = map.entrySet();
        for(Map.Entry<Integer,String> kv : kvSet){
            String value = kv.getValue();
            int key = kv.getKey();
            System.out.println(key+","+value);
        }
    }
}
