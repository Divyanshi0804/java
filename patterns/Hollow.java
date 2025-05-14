package patterns;
public class Hollow {
    public static void main(String[] args) {
       int n=4; 
       int m=5; 
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(((row==0||row==n-1)&&(col==0||col==m-1))||((row>0 && row<n-1)&&(col>0&&col<m-1))){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                       
            } System.out.println();
        }
    }
    
}


/*
 

 ***
*   *
*   *
 ***    


 */