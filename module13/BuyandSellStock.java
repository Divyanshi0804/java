package module13;

public class BuyandSellStock {
    public static int maxProfit(int[] arr) {
        int minTillNow = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            minTillNow = Math.min(minTillNow, arr[i]);

            maxProfit = Math.max(arr[i] - minTillNow, maxProfit);
        }
        return maxProfit;
        
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 1, 3, 10 };
        System.out.println(maxProfit(arr));
    }

    
}
//[4,2,9,1,3,5]