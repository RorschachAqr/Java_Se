package CollectionStudy.TreeSetCase2;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() { //采用匿名内部类方法
            @Override
            public int compare(Student s1, Student s2) {
                //this.age - s.age
                //s1,s2
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        //创建学生
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

        for(Student s : ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
