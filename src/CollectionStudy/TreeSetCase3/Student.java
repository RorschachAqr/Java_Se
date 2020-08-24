package CollectionStudy.TreeSetCase3;

public class Student {
    private String name;
    private int literature;
    private int math;

    public Student() {
    }

    public Student(String name, int literature, int math) {
        this.name = name;
        this.literature = literature;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum(){
        return this.literature+this.math;
    }

}
