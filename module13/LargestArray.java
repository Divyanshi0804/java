package module13;

class LargestArray{
    
    public static int findLargest(int[] arr) {
        int largestElement=-1;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>largestElement){
                largestElement=arr[i];
                
            }
            System.out.println(i + " " + arr[i] + " " + largestElement);
        }   
        return largestElement;
        
    }
    
    
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[3]=7;
        arr[4]=2;
        arr[2]=13;
        arr[0]=1;
        int n = findLargest(arr);
        System.out.println("largest element = "+ n);
    }
} 
