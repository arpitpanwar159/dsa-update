public class desecendingbubble {

    public static void bubbleShort(int arr[]){
        
        for (int i = 0; i <=arr.length-1; i++) {
            
            for (int j =0; j < arr.length-1-i; j++) {
                

                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
                
            }

            
        }

    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
    public static void main (String args[]){
        int arr[]={3,6,1,1,2,8,7,4,5,3,1};
        bubbleShort(arr);
        printArr(arr);
    }
}
