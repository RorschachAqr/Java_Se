package GenericStudy3;

public class Generic {
    /*public void show(T t){
        System.out.println(t);
    }

     */

    /*public void show(Integer i){
        System.out.println(i);
    }

    public void show(Boolean b){
        System.out.println(b);
    }
     */
    //泛型方法改进
    public <T> void show(T t){
        System.out.println(t);
    }
}
