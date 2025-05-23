class MaxSumSubArray {

    public static int getMaxSumBF(int[] arr) {
        int maxSumTillNow = Integer.MIN_VALUE;
        for (int startIdx = 0; startIdx < arr.length; startIdx++) {
            for (int endIdx = startIdx; endIdx < arr.length; endIdx++) {
                int total = 0;
                for (int i = startIdx; i <= endIdx; i++) {

                    total = total + arr[i];

                }
                if (maxSumTillNow < total) {
                    maxSumTillNow = total;
                }
            }
        }

        return maxSumTillNow;
    }

    public static int getMaxSumPF(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefixArr = new int[arr.length];
        prefixArr[0]= arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for (int startIdx = 0; startIdx < arr.length; startIdx++) {
            for (int endIdx = startIdx; endIdx < arr.length; endIdx++) {
                int extra=0;
                if (startIdx > 0) {
                 extra = prefixArr[startIdx -1];   
                }
                 
                int currentSum = prefixArr[endIdx] - extra; 
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }

        }
        return maxSum;



        
    }


    // [-5,3,-1,2]
//[-5,-2,-3,-1]
//s 0 0 0 0   
//e 0 1 2 3




public static void main(String[] args) {
    int[] arr = { -5, 3, -1 ,2 };
    System.out.println(getMaxSumBF(arr));
    System.out.println(getMaxSumPF(arr));
        
    }
}
