public class insertionSort {
    public static void insertion_Short(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while (j>0&&arr[j-1]>arr[j]) {
                //swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                
            }
            
        }
        
    }
     public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,2,1};
        printArr(arr);
        insertion_Short(arr);
    }
    
}
