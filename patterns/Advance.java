package patterns;
public class Advance {
    public static void main(String[] args) {
        int[][] arr ={{0,1,1,1,0},{1,0,0,0,1},{0,0,0,0,1},{1,1,1,1,0}};

           for(int i=0;i<4;i++){
             for(int j=0;j<5;j++){
    
               if(arr[i][j]==0){
                System.out.print(" ");
               } 
                else{
                System.out.print("*");
                }
             }
             System.out.println();
        }

        
    }
}
/*
 

 ***
*   *
    *
****    


 */