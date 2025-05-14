package module11;

public class Swap {
    public static int[] swapnum(int a, int b){
      int temp=a;
        a=b;
         b=temp;
        int[] swapArr= new int[] {a,b};
        return swapArr;
    } 
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int[] swappedNum = swapnum(a,b);
          
        System.out.printf("%d %d", swappedNum[0], swappedNum[1]);

        int[] arr=new int[5];
        arr[0]=3;
        System.out.printf(" num at index 4 is: %d",arr[5]);
    }
}
