import java.util.*;
public class revrse {
    public static void rev(int number[]){
        int start=0;
        int end=number.length-1;
        
        while(start<=end){
            //swap
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;

        }
      
            
        }
    
        
         public static void main(String[] args) {
        int number[]={52,5,63,3,4,24,13,67};

     rev(number);
     for(int i=0;i<=number.length-1;i++){
        System.out.print(number[i]);
     }
       

}
    }

   