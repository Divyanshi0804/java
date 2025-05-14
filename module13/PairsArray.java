public class PairsArray {
    public static void pair(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.printf("(%d,%d)", arr[i], arr[j]);
            }
            System.out.println();

        }
        
       
        

        //[1,3,5,6]
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 8;
        pair(arr);
    }
}
