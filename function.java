// import java.util.*;
//  public class function {
//     public static void printhelloworld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");   
//     }
//     public static int calculatesum(int num1 ,int num2){//Parameters or Formal Paramerters
//     int sum=num1+num2;
//     return sum;
//     }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int sum=calculatesum(a, b);//Arguments or Actual Parameters
//     System.out.println("The sum is:"+sum);    
// }
//  }
// import java.util.*;
// public class function {

// public static void main(String[] args) {
// int a=8;
// int b=9;
// int temp=a;
// a=b;
// b=temp;
// System.out.println(a);

// }
// }
// import java.util.*;
// public class function {
//     public static int multiply(int a, int b){
//         int multi=a*b;
//         return multi;
//     }
//     public static int factorial(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         return f;
//     }
//     public static int binomialcoff(int n,int r){
//         int fact_n=factorial(n);
//         int fact_r=factorial(r);
//         int fact_nmr=factorial(n-r);
//         int bincof=fact_n/(fact_r*fact_nmr);
//         return bincof;
//     }

//     public static void main(String[] args) {
//     Scanner t=new Scanner(System.in);
//     int a=t.nextInt();
//     int r=t.nextInt();
//     int n=t.nextInt();
        
//         System.out.println("The factorial is:"+factorial(n));
//         System.out.println("The value of ncr is:"+binomialcoff(n, 2));
//     }
// }
// Function overloading by parameters
// import java.util.*;
// public class function {
//     //fun1
//     public static int sum(int a, int b){
//         return a+b;

//     }
//     public static int sum(int a, int b,int c){
//         return a+b+c;
//     }


//     public static void main(String[] args) {
//         System.out.println(sum(5,3));
//         System.out.println(sum(5, 2, 1));
        
//     }
// }
//using data type
// import java.util.*;
// public class function {
//     //fun1
//     public static int sum(int a, int b){
//         return a+b;

//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
//     public static double sum(double a,double b){
//         return a+b;
//     }


//     public static void main(String[] args) {
//         System.out.println(sum(5,3));
//         System.out.println(sum(5.2f, 2.8f));
//         System.out.println(sum(5.2, 2.8));
        
//     }
// }
// import java.util.*;
// public class function {
//     public static void main(String[] args) {
//         Scanner ob=new Scanner(System.in);
//         System.out.print("Enter the Number:");
//         int n=ob.nextInt();
//         if(n==2){
//             System.out.println("It is a Prime Number");
//         }
       
//       for(int i=2;i<=n-1;i++){
        
//         if(n%i==0){
//             System.out.println("This is not a Prime Number");
//         }
//         else{
//             System.out.println("This is a Prime Number");
//         }
//         break;
//       }
//     }
// }
// import java.util.*;
// public class function {

    
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=n-1;i++){
//            if(n%i==0){
//             return false;
//            }
//            break;
//         }
//         return true;  
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(6));
//     }
// }
//Otimezed Solution
// import java.util.*;
// public class function {

//     public static boolean isPrime(int n){
//    if(n==2){
//     return true;

//    } 
//    for(int i=2;i<=Math.sqrt(n);i++){
//     if(n%i==0){
//         return false;
//     }
//     break;
//    }
//    return true;
//     }
// public static int primeInRange(int n){
//     int count=0;
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){
                
//                 System.out.print(i+" ");
//                 count++;
//             }
            
//         }
//         return count;
//     }
   
//     public static void main(String[] args) {
   
//     System.out.println(primeInRange(500000000));
//     }
// }
// import java.util.*;
// public class function {
//     public static void binTodec(int binNum){
//         int pow=0;
//         int dec=0;
//         while(binNum>0){
//             int ld=binNum%10;
//             dec=dec+(ld*(int)Math.pow(2, pow));
//             pow++;
//             binNum=binNum/10;
//         }
//         System.out.println(dec);
//     }
//     public static void decTobin(int decnum){
//         int bin=0;
//         int pow=0;
//         while(decnum>0){
//             int rem=decnum%2;
//             bin=bin+(rem*(int)Math.pow(10,pow));
//             pow++;
//             decnum=decnum/2;
//         }
//         System.out.println(bin);
//     }

//     public static void main(String[] args) {
//         decTobin(891);
//         binTodec(1101111011);
   
        
//     }
// }
//Practice qution
// import java.util.*;
// public class function {

//     public static float avg(float a,float b,float c){
//         return (a+b+c)/3;
//     }
//     public static void main(String[] args) {
//         System.out.println("The avrage of three numbers are :"+avg(2, 2, 4));
//     }
// }
// import java.util.*;

// import javax.security.sasl.SaslException;
// public class function {

//     public static boolean isEven(int n){
//         if(n%2==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner b=new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n=b.nextInt();
//         System.out.println(isEven(n));
//     }
// }
//Palidrone number and reverse number 
// import java.util.*;
// public class function {

//     public static void main(String[] args) {
        
//         int n=121;
//         int reversed=0;
//         while(n!=0){
//             int digit=n%10;//to last digit
           
//             reversed=(reversed*10)+digit;
//             n=n/10;//to remove last digit
//             if (n==reversed) {
//                 System.out.println("this is a palidrone number");
                
//             }
//             else{
//                 System.out.println("This is not a palidrone number");
//             }
            

//         }
//         System.out.println(reversed);
     
    
   
//     }
//     }
// import java.util.*;
// public class function {

//     public static boolean PalidroneNumber(int n){
//         int rev=0;
//         int a=n;
//         while (a!=0) {
//             int digit=n%10;//to last digit
//             rev=(rev*10)+digit;
//             a=a/10;//to remove last digit
            
//         }
//         if(n==rev){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//        if (PalidroneNumber(121)) {
//         System.out.println("This is a Palidrone Number");
        
//        }
//        else{
//         System.out.println("This is not a Palidrone Number");
//        }
      
//     }
// }
import java.util.*;
public class function {

    public static void main(String[] args) {
        int b=1;
        int a=0;
        for(int i=0;i<=13;i=a+b){
            a=b;
            b=i;
            System.out.println(i);
        }
    }
}


