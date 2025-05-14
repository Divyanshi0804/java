package module11;

public class PrimeRange {
    public static boolean isPrime(int n){
        //  if(n==2){  //special case 
        //      return true;
        //   }
        for(int i=2;i<=Math.sqrt(n);i++)
         if(n%2==0){
            return false;
        }
        return true;
    }
    public static void PrimeinRange(int n){
        for(int i=2;i<=n;i++)
            if(isPrime(i)){  //  true
                System.out.println(i+"");
            }
        System.out.println();    
    }
    public static void main(String[] args) {
        PrimeinRange(20);
    }
    
}
