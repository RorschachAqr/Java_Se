package CollectionStudy.HashCode;

public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("rorschach",20);
        //同一个对象多次调用hashCode（）方法返回的哈希值是相同的
        System.out.println(s1.hashCode());//1163157884
        System.out.println(s1.hashCode());//1163157884
        //创建第二个学生对象
        Student s2 = new Student("rorschach",20);
        //默认情况下，不同对象哈希值不同
        System.out.println(s2.hashCode());//1956725890
        //通过方法重写，可以实现不同对象哈希值相同
        System.out.println("--------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818
        System.out.println("hello".hashCode());//99162322
        System.out.println("--------");
        //相同基本类型的哈希值相同
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
        //String重写了hashCode方法
    }
}
