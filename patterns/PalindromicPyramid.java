package patterns;
public class PalindromicPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=5; row++){
            for(int col=n , colNext=2; col>=1|| colNext<=row ; col--){
                if(col<1){
                    System.out.print(colNext++);
                }else if(row>=col){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
                
                
            } System.out.println();
        }
    }
}


/*
      1
     212
    32123
   4321
  54321



  i  j
  1  5
  1  4
  1  3
  1  2
  1  1
  2  5
  2  4
  2  3
  2  2
  2  1
  3  5
  3  4
  3  3
  3  2
  3  1
 */