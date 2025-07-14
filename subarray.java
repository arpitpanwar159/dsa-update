// import java.util.*;
// public class subarray {
//     public static void subArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;i<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+" ");
//                 }
//                 System.out.println();

//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         subArray(arr);

//     }
// }
// import java.util.*;
// public class subarray {
//     public static void subArray(int arr[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i;i<arr.length;j++){
//                 currSum=0;
//                 for(int k=i;k<=j;k++){
//                     currSum+=arr[k];
//                     System.out.print(arr[k]+" ");
//                     if(maxSum<currSum){
//                         maxSum=currSum;
//                     }
                    
//                 }
//                 System.out.println();
//                    System.out.println(currSum);
//             }
          
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         subArray(arr);
//     }
// }
// import java.util.*;
// public class subarray {
//     public static void subArray(int arr[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int [arr.length];
//         prefix[0]=arr[0];
//         //calculate prefix array
//         for(int i=1;i<=prefix.length-1;i++){
//             prefix[i]=prefix[i-1]+arr[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             currSum=0;
//             for(int j=i;j<arr.length;j++){
//              currSum=i==0? prefix[j]:prefix[j]-prefix[i-1];//if i=0 then index-1 is invalid it is conditional statement
//                     if(maxSum<currSum){
//                         maxSum=currSum;
//                     }
//                 }    
//             }
//            System.out.println("The Maximum sum is the:"+maxSum);
//         }
//     public static void main(String[] args) {
//         int arr[]={1,-2,6,-1,3};
//         subArray(arr);
//     }
// }

//most optimize Kadane's algorithm
// import java.util.*;
// public class subarray {
//     public static void kadaneAlgo(int num[]){
//         int maxSum=Integer.MIN_VALUE;
//         int currSum=0;
//         for(int i=0;i<num.length;i++){  
//            currSum=Math.max(num[i], currSum+num[i]);
//             maxSum=Math.max(maxSum, currSum);
//         }
//         System.out.println(maxSum);

//     }
//     public static void main(String[] args) {
//         int num[]={-2,-3,4,-5,4,2};
//         kadaneAlgo(num);
        
//     }
// }