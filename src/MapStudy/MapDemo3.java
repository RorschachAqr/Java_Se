package MapStudy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","Allen");
        map.put("2","Rorschach");
        map.put("3","Eric");
        //V get(Object key) 根据键获取值
        System.out.println(map.get("3"));//Eric
        System.out.println(map.get("4")); //null
        //Set<K> keySet() 获取所有键的集合，因为是集合，所以要创建对象
        Set<String> set = map.keySet();
        System.out.println(set);//1,2,3
        //Collection<V> values() 获取所有值的集合，因为是集合，要创建对象
        Collection c = map.values();
        System.out.println(c);//Allen,Rorschach,Eric
        //Set<Map.Entry<K,V>> entrySet() 获取所有键值对对象集合
        Set<Map.Entry<String,String>> kvSet = map.entrySet();
        System.out.println(kvSet);//输出所有键值对集合
    }
}
