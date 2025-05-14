package module11;

public class BinaryToDecimal {
    public static  void binTodec( int binNum) {
        int myNum = binNum;
        int pow=0;
        int deciNum=0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
           deciNum = deciNum + (lastDigit * (int)Math.pow(2,pow));
            
           pow++;
           binNum= binNum/10;
       
        }

        System.out.println("decimal of" + myNum + "=" + deciNum);

    }
    public static void main(String[] args) {
        binTodec(1001);
    }
}
/*
 n=101
     2^0 
     1(1)
 */