package CollectionStudy.TreeSetCase3;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //int num = (s2.getLiterature()+s2.getMath())-(s1.getLiterature()+s1.getMath());
                int num = s2.getSum() - s1.getSum();
                //总分一样时用语文进行排序
                int num2 = num == 0 ? s1.getLiterature() - s2.getLiterature() : num;
                //语文一样时用名字进行排序
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        Student s1 = new Student("Allen",98,97);
        Student s2 = new Student("Fork",96,95);
        Student s3 = new Student("Rorschach",90,87);
        Student s4 = new Student("Eric",93,97);
        Student s5 = new Student("Jimmy",97,93);
        Student s6 = new Student("Joker",97,93);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student s : ts){
            System.out.println(s.getName()+","+s.getLiterature()+","+s.getMath());
        }
    }
}
