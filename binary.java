import java.util.*;
public class bin {
    public static int bnarySearch (int number[],int key){
        int start=0;
        int end=number.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==key){
            return 1;
        }
        if (mid<key) {
            start=mid+1;
            
        }
        else{
            end=mid-1;
        }
        }
        return-1;
            
        }
    
        
    

    public static void main(String[] args) {
        int number[]={52,5,63,3,4,24,13,67};
        int key=24;
        int t=bnarySearch(number,key);
        if(t==1){
            System.out.println("key is avilable");
        }
        else if (t==-1) {
            System.out.println("key is not avilable");
            
        }
       
    }
}
