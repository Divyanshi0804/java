class ReverseArray {
    public static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
            //[2,4,6,8]
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 1;
        printArray(arr);
        reverse(arr);
        printArray(arr);

    }
}
