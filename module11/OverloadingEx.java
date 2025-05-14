package module11;

public class OverloadingEx {
    public static int sum(int a, int b) {
        return a+b;
        
    }

    public static int sum(int a,int b, int c){ //by changing no of parameter
        return a+b+c;
    }

    public static float sum(float a,float b){ //by changing diff datatype
        return a+b;
    }


    public static int sum(int a,boolean b){
        return a+Integer.valueOf(String.valueOf(b),2);
    }
    public static void main(String[] args) {
        System.out.println(sum(3,7));
        System.out.println(sum(4,6,9));
        System.out.println(sum(2.3f,3.5f));
    }
}
