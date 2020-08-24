package stateStudy.staticStudy;

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.university = "传值大学";
        s1.name = "林青霞";
        s1.age = 30;
        //s1.university = "传值大学";
        s1.show1();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 33;
        //  s2.university = "传值大学";
        s2.show1();
    }
}
