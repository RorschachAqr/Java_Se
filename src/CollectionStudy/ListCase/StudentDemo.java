package CollectionStudy.ListCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student(1,"Rorschach",20);
        Student s2 = new Student(2,"Allen",21);
        Student s3 = new Student(3,"Eric",22);
        //创建集合对象
        List<Student> sl = new ArrayList<>();
        //添加学生对象
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        //遍历方法一,Iterator方法
        Iterator<Student> si = sl.iterator();
        while(si.hasNext()){
            Student s = si.next();
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge());
        }

        //遍历方法二，循环遍历
        for(int i = 0; i < sl.size(); i++){
            Student st = sl.get(i);
            System.out.println(st.getSid()+","+st.getName()+","+st.getAge());
        }
    }
}
