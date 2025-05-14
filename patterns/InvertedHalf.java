package patterns;
public class InvertedHalf {
    public static void main(String[] args) {
        int n =5;
        int m=5;
        for(int i=0; i<n; i++){
            for(int j=0;j<m-i; j++){
             System.out.print(j+1);
            }
             System.out.println();
        }
    }
    
}


/*
 12345
 1234
 123
 12
 1


 


 */