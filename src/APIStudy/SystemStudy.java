package APIStudy;

public class SystemStudy {
    public static void main(String[] args) {
        System.out.println("Start");
        //程序结束状态码0
        //System.exit(0);
        //不执行
        System.out.println("End");
        //当前时间与1970年之间的毫秒值
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10000 ; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }
}
