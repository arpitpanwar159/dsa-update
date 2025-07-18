
public class bubleSort {
    public static void buble_Sort(int arr[]){
       for(int turn=0;turn<arr.length-1;turn++){
        for (int j = 0; j < arr.length-1-turn; j++) {
            if(arr[j]>arr[j+1]){
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
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,5,6,35,1,2};
        buble_Sort(arr);
        printArr(arr);
        
    }
}