package MapStudy;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<>();
        //put()
        map.put("1","Allen");
        map.put("2","Rorschach");
        map.put("3","Eric");
        //输出集合
        System.out.println(map);
        System.out.println("-----");
        //remove()
        map.remove("3");
        System.out.println(map);
        System.out.println("-----");
        //containsKey()
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsKey("4"));
        System.out.println("-----");
        //containsValue()
        System.out.println(map.containsValue("Allen"));
        System.out.println(map.containsValue("Jimmy"));
        System.out.println("-----");
        //size()
        System.out.println(map.size());
        System.out.println("-----");
        //isEmpty()
        System.out.println(map.isEmpty());
        System.out.println("-----");
        //clear()
        map.clear();
        System.out.println(map);
    }
}
