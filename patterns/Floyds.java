package patterns;
public class Floyds {
    public static void main(String[] args) {
        int n=5;
        int preRowFirstColValue = 2; 
        for( int row=0; row<n; row++){
            for(int col=0; col<=row; col++){
                if(col==0)
                    preRowFirstColValue += row-1;
                System.out.print(row+col+preRowFirstColValue);
            }
                System.out.println();
        }
    }
}
/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15



 i  j 
 0  0
 1  0
 1  1
 2  0
 2  1
 2  2
 3  0
 3  1
 3  2
 3  3

 */