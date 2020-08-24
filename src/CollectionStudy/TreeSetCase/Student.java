package CollectionStudy.TreeSetCase;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //自己创建的类需要重写比较方法
    @Override
    public int compareTo(Student s) {
        //return 1;按照存储顺序输出
        //return -1;倒着输出
        //按照年龄从小到大
        int num = this.age - s.age;
        //按照年龄从大到小 int num = s.age-this.age
        //年龄相同的时候，按照姓名的字母顺序排列
        int num2 = num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
