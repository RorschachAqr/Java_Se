package MapStudy.HashMapCase;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
    用HashMap存储学生学号和学生对象并遍历
    键是学号，值是学生对象
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("Allen",20);
        Student s2 = new Student("Rorschach",21);
        Student s3 = new Student("Eric",20);
        Student s4 = new Student("Jimmy",23);
        //创建集合对象
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        map.put(4,s4);
        //遍历集合-方式一
        Set<Integer> kSet = map.keySet();
        for(int sid : kSet){
            Student s = map.get(sid);
            System.out.println(sid + "="+ s.getName()+","+s.getAge());
        }
        System.out.println("------------");
        //遍历集合-方式二
        Set<Map.Entry<Integer,Student>> kvSet = map.entrySet();
        for(Map.Entry<Integer,Student> kv : kvSet){
            Student s = kv.getValue();
            System.out.println(kv.getKey()+ "=" + s.getName()+","+s.getAge());
        }
    }
}
