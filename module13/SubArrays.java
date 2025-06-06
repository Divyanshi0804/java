class SubArrays {
    
    public static void printSubArray(int[] arr) {
        for (int startIdx = 0; startIdx < arr.length; startIdx++) {
            for (int endIdx = startIdx; endIdx < arr.length; endIdx++) {
                for (int i = startIdx; i <= endIdx; i++) {

                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void printSubArray2(int[] arr) {
        for (int size = 1; size <= arr.length; size++) {
            for (int startIdx = 0; startIdx < arr.length - size + 1; startIdx++) {
                int endIdx = startIdx + size - 1;
                for (int i = startIdx; i <= endIdx; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 6;
        arr[2] = 26;
        arr[3] = 7;
        // printSubArray(arr);
        printSubArray2(arr);
    }
}


//[2,6,5,7]
//[2,6] [6,5] [5,7] [2,6,5] [6,5,7] [2] [6] [5] [7] 