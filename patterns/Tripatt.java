package patterns;
public class Tripatt {
    public static void main(String[] args) {
        int n=5;
            for(int row=0; row<n;row++){
                for(int col=0; col<=row; col++){

                    if((row+col)%2==0){
                        System.out.print("1");

                    }else{
                        System.out.print("0");
                    }
                }   System.out.println();
            }
    }
}
/*
1
01
101
0101
10101


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