package stateStudy.staticStudy;

public class Student {
    public String name;
    public int age;
    //public String university;
    public static String university;

    public void show1(){
        System.out.println(name+","+age+","+university);
    }

    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    public static void show3(){

    }

    public static void show4(){
        System.out.println(university);
        //show1();
        show3();
    }
}
