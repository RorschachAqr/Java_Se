package CollectionStudy.CollectionCase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合和学生对象
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student(1,"Rorschach",20);
        Student s2 = new Student(2,"Allen",21);
        Student s3 = new Student(3,"Eric",22);
        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //遍历集合
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge());
        }
    }
}
