package module13;

public class TrappingRainWater {
    public static int trapWater(int[] arr) {
        int l=arr.length;
        int[] leftMax = new int[l];
        leftMax[0] = arr[0];
        for (int i = 1; i < l; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);

        }
        int[] rightMax = new int[l];
        rightMax[l - 1] = arr[l - 1];
        for (int r = l - 2; r >= 0; r--) {
            rightMax[r] = Math.max(rightMax[r + 1], arr[r]);
        }
        int storedWater = 0;
        for (int i = 1; i < l - 1; i++) {
            storedWater += Math.min(rightMax[i], leftMax[i])-arr[i];
        }

        return storedWater;
        //[4,2,5,3,4]
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 3, 4 };
        System.out.println(trapWater(arr));
        
    }
}
