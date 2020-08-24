package MapStudy.CollectionsCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
ArrayList存储学生对象并用Collections进行排序
要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("Allen",20);
        Student s2 = new Student("Rorshcach",21);
        Student s3 = new Student("Eric",20);
        Student s4 = new Student("Jimmy",22);
        //添加元素到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        //使用collections进行排序
        //使用comparator进行排序
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照年龄从大到小排序，年龄相同时，按照姓名字母顺序排
                int num = s1.getAge()-s2.getAge();
                int num2 = num == 0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        //第一种遍历方式Iterator
        Iterator<Student> it = array.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("-------");
        //第二种遍历方式
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("-------");
        //第三种遍历方式
        for (Student s : array){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
