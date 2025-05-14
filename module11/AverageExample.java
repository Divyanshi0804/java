package module11;

public class AverageExample {
    public static void   averageCalc(float ...nums ){
        float sum=0;
        for(float num:nums)
         sum = sum+num;
        System.out.printf( "%f", sum/nums.length);
    }
    public static void main(String[] args) {
        averageCalc(11, 20, 10);
    }
}
