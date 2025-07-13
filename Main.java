 // import java.util.*;
// // // public class array {

// // //     public static int linearsearch(int number[],int key){
// // //         for(int i=0;i<number.length;i++){
// // //             if(number[i]==key){
// // //                 return i;
// // //             }
// // //         }
// // //         return -1;
// // //     }
// // //     public static void main(String[] args) {
// // //         int number[]={5,6,7,1,2,3,0,13,15,38};
// // //         int key=0;
// // //         int index=linearsearch(number, key);
// // //         if(index==-1){
// // //         System.out.println("NOT FOUND");
// // //     } else{
// // //         System.out.println("key is at index  "+index);
// // //     }
// // //     }
// // // }
// // import java.util.*;
// //  public class array {
 
// //     public static int getlargest(int number[]){
// //         int largest=Integer.MIN_VALUE;
// //         for(int i=0;i<number.length;i++){
// //             if(largest<number[i]){
// //                 largest=number[i];
// //             }
            
// //         }return largest;
// //     }
// //     public static void main(String[] args) {
// //         int number[]={1,2,6999,30000,5};
// //         System.out.println("This number is greatest Number   "+getlargest(number));
// //     }
// //  }
// // Binary Search
// // import java.util.*;
// // public class array {
// //     public static int binarysearch(int number[],int key){
// //         int start=0; 
// //         int end=number.length-1;
// //         while(start<=end){
// //             int mid=(start+end)/2;
// //             //compersion
// //             if(number[mid]==key){
// //                 return mid;

// //             }
// //             if(number[mid]<key){//right
// //                 start=mid+1;
// //             }else{//left
// //                 end=mid-1;
// //             }
// //         }
// //         return -1;
// //     }

// //     public static void main(String[] args) {
// //         int number[]={1,3,6,7,9,10,14,16,67,68};
// //         int key=69;
// //         System.out.println("The key is at index "+binarysearch(number, key));
// //     }
// // }
// // import java.util.*;
// // public class array {
// //     public static void revrse(int number[]){
// //         int first=0; 
// //         int last=number.length-1;
// //         while(first<last){
// //             int temp=number[first];
// //             number[first]=number[last];
// //             number[last]=temp;
// //             first++;
// //             last--;
// //         }
// //     }

// //     public static void main(String[] args) {
// //         int number[]={2, 3, 4, 5, 7, 9, 10};
// //         revrse(number);
// //         for(int i=0;i<=number.length-1;i++){
// //             System.out.print(number[i]+"   ");
// //         }
// //         System.out.println();
// //     }
// // }
// // array in pairs
// // import java.util.*;
// // public class array {
// //     public static void pairsarray(int number[]){
// //         for(int i=0;i<=number.length-1;i++){
// //             int curr=number[i];
// //             for(int j=i+1;j<=number.length-1;j++){
// //                 System.out.print("("+curr+","+number[j]+")");
// //             }
// //             System.out.println();
// //         }
        
// //     }
// //     public static void sumarray(int num[]){
// //         int sum =0;
// //         for(int i=0;i<=num.length-1;i++){
// //             sum=sum+num[i];
// //         }
// //         System.out.println(sum+" : This is sum of array");
        
// //     }

// //     public static void main(String[] args) {
// //         int num[]={2,4,6,8,10,999999999};
// //         sumarray(num);

       
// //     }
// // }
// // import java.util.*;
// // public class array {
// //     public static void subarrray(int num[]){
// //         for(int i=0;i<=num.length-1;i++){
// //             int start=num[i];
// //             for(int j=i;j<=num.length-1;j++){
// //                 int end=num[j];
// //                 for( start=num[i];start<end; start++){
// //                     System.out.print(start );
// //                 }
// //                 System.out.println();
// //             }
// //             System.out.println();
// //         }
// //         System.out.println();
// //     }

// //     public static void main(String[] args) {
// //         int num[]={1,2,3,4,5,6,7};
// //         subarrray(num);

// //     }
// // }
//MAX suba array BRUTE FORCE    
// import java.util.*;
// public class array {
//     public static void maxsumarray(int num[]){
//         int curr_value=0;
//         int max_value=Integer.MIN_VALUE;
//         for(int i=0;i<=num.length;i++){
//             int start=i;
//             for(int j=i;j<=num.length;j++){
//                 int end=j;
//                 curr_value=0;
//                 for(int k=start;k<end;k++){
//                     curr_value+=num[k];
//                     System.out.print(num[k]);
//                 if(max_value<curr_value){
//                     max_value=curr_value;   
//                 }
//                 }
//                 System.out.println();
//             }
          
            
//         }
//         System.out.print(max_value);
        
//     }

//     public static void main(String[] args) {
//         int num[]={1,2,3};
//         maxsumarray(num);
//     }
// }
// Max subarray sum (prefix array)
// import java.util.*;
// public class array {
//     public static void maxsubarraysumprefix(int num[]){
//         int curr_value=0;
//         int max_value=Integer.MIN_VALUE;
//         int prefix[]=new int[num.length];
//         prefix[0]=num[0];
//         for(int i=1;i<=prefix.length-1;i++){
//             prefix[i]=prefix[i-1]+num[i];
//         }
//         for(int i=0;i<=num.length-1;i++){
//             int start=i;
//             for(int j=i;j<=num.length-1;j++){
//                 int end=j;
//                 curr_value=start==0 ? prefix[end] :prefix[end]-prefix[start-1];
//                 if(max_value<curr_value){
//                     max_value=curr_value;
//                 }
//             }
//         }
//         System.out.print(max_value);
//     }

//     public static void main(String[] args) {
//         int num[]={1,2,3,4};
//         maxsubarraysumprefix(num);
//     }
// }
// import java.util.*;
// public class array {
//     public static void sumarr(int arr[]){
//         int sum =0;
//         for(int i=0;i<=arr.length-1;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         int arr[]={6,7,8};
//        sumarr(arr);

//     }
// }
//Linear Search
// import java.util.*;

// public class Main {
//     public static int linearsearch(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] == key) {
//                 return 1; // Key found
//             }
//         }
//         return -1; // Key not found after checking all elements
//     }

//     public static void main(String[] args) {
//         int number[] = {2, 7, 5, 4, 93, 20, 10};
//         int key = 10;
//          linearsearch(number, key);
       
//     }
// }
//Linear search
// import java.util.*;
// public class Main {

//     public static int linearSearch(int number[], int key){
//     for(int i=0;i<number.length;i++){
//         if(number[i]==key){
//             return 1;
//         }
     
//     }
//        return -1;
// }
// public static void main (String[] args){
//     int number[]={2,7,5,4,93,20,10};
//     int key=104;
//     int cheak=linearSearch(number, key);
//     if(cheak==1){
//         System.out.println("That's Solve");
//     }
//     else if(cheak==-1){
//         System.out.println("Key is not avilable");
//     }
// }

// }
//for the max value
// import java .util.*;
// public class Main {
//     public static int maxNumber(int number[]){
//         int largest=Integer.MIN_VALUE;
//         for(int i=0;i<=number.length-1;i++){
//             if(largest<number[i]){
//                 largest=number[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int number[]={1,2,3,4,5};
//         System.out.println(maxNumber(number));;

//     }
// }
// for the min value
// import java.util.*;
// public class Main {
//     public static int minNumber(int number[]){
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<number.length-1;i++){
//             if(smallest>number[i]){
//                 smallest=number[i];
//             }
//         }
//         return smallest;
//     }

//     public static void main(String[] args) {
//         int number[]={67,244,344,444,555,74};
//         System.out.println(minNumber(number));
//     }
// }
