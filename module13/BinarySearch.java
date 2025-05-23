//package module13;

class BinarySearch{
    public static int search(int[] arr , int key ) {
        int start = 0;
        int end=arr.length-1;
        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[5] = 1;
        arr[6] = 3;
        arr[7] = 5;
        arr[8] = 10;
        arr[9] = 15;

        System.out.println(search(arr, 5));
    }
}
