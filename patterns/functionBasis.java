package patterns;
public class functionBasis {

    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int product = multiply(3,5);
        System.out.print("a * b  ="+product);
    }
}
