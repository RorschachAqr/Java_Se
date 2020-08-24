package CollectionStudy.HashSetCase;

import java.util.HashSet;

//要消除重复元素需要重写HashCode和equals方法

public class StudentDemo {
    public static void main(String[] args) {
        //创建学生对象，创建HashSet集合表
        HashSet<Student> hs = new HashSet<Student>();
        Student s1 = new Student("Allen",20);
        Student s2 = new Student("Rorschach",21);
        Student s3 = new Student("Eric",22);
        Student s4 = new Student("Eric",22);

        //添加学生对象
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历集合
        for(Student s : hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
