package patterns;
public class Numberpyramid {
    public static void main(String[] args) {
        int n=5;
            for(int row=1;row<=n;row++){
                for(int col=1 ; col<=n+row-1 ;col++){
                    if(col<=n-row || (row%2==0&&col%2!=0)||(col%2==0&&row%2!=0)){
                        System.out.print(" ");
                    }
                    
                    else{
                        System.out.print(row);
                    }
                }System.out.println();

            }
    }
}
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5



row 1 1 1 1 1  2 2 2 2 2  3 3 3 3 3
col 1 2 3 4 5  1 2 3 4 5  1 2 3 4 5

 */