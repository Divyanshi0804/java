package module13;

class LinearSearch{
    public static void linearSearch(int[] arr , int desiredElement) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]==desiredElement){
                System.out.println("desired Element found at index " + i);
                return;
            }
            
        }
        System.out.println("desired element not found");
    
    }
  
    public static void main(String[] args) {
        int n=10;
        int[] arr= new int[20];
        arr[0]=10;
        arr[11]=2;
        arr[8]=14;
        arr[8]=15;
        
        linearSearch(arr,n);
    }
}

