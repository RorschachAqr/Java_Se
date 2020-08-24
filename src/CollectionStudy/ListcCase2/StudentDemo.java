package CollectionStudy.ListcCase2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1,"林青霞",30);
        Student s2 = new Student(2,"罗玉凤",31);
        Student s3 = new Student(3,"风清扬",40);

        List<Student> sl = new ArrayList<>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        //第一种遍历方式for循环
        for(int i  = 0; i < sl.size(); i++){
            Student s = sl.get(i);
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge());
        }
        System.out.println("------");

        //第二种遍历Iterator方式
        ListIterator<Student> lt = sl.listIterator();
        while(lt.hasNext()){
            Student s = lt.next();
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge());
        }
        System.out.println("------");

        //第三种遍历增强for循环
        for(Student s:sl){
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge());
        }
    }
}
