package CollectionStudy.TreeSetCase;

import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
       TreeSet<Student> ts = new TreeSet<Student>();
       //创建学生对象
        Student s1 = new Student("Allen",20);
        Student s2 = new Student("Rorschach",21);
        Student s3 = new Student("Eric",22);
        Student s4 = new Student("Star",23);
        Student s5 = new Student("Jimmy",23);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历集合
        for(Student s : ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
