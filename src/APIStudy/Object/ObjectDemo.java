package APIStudy.Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        // ctrl+B 看方法源码
        //System.out.println(s);
        //System.out.println(s.toString());
        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);
        System.out.println(s.equals(s2));
    }
}
