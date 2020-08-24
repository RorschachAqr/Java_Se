package MapStudy.HashMapCase2;

import java.util.HashMap;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();
        Student s1 = new Student("Allen",20);
        Student s2 = new Student("Rorschach",21);
        Student s3 = new Student("Eric",20);
        Student s4 = new Student("Eric",20);
        hm.put(s1,"西安");
        hm.put(s2,"武汉");
        hm.put(s3,"郑州");
        hm.put(s4,"北京");
        Set<Student> keySet = hm.keySet();
        for(Student key : keySet){
            String value = hm.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
