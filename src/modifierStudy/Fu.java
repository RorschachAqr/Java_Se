package modifierStudy;

public class Fu {
    private void show(){
        System.out.println("private");
    }

    void show2(){
        System.out.println("default");
    }

    public void show3(){
        System.out.println("public");
    }

    protected void show4(){
        System.out.println("protected");
    }

    public static void main(String[] args){
        Fu f = new Fu();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }
}
