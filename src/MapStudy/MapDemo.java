package MapStudy;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();
        //map集合的添加方法是put
        map.put("1","Allen");
        map.put("2","Rorschach");
        map.put("3","Eric");
        //当键值重复的时候，后面的值会替代以前的值
        map.put("3","Jimmy");
        //输出集合对象
        System.out.println(map);
    }
}
