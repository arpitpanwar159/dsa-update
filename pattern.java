// import java.util.*;
// public class pattern{
//     public static void main(String []args){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//                 if ((i==1&&j==4)||(i==2&&j!=1&&j!=2)||(i==3&&j!=1)||(i==4)) {
//                     System.out.print("*");
                    
//                 }
//                 else{
//                         System.out.print(" ");
//                     }
                    
//             }
//             System.out.println();
//         }
//     }
// }
// import java.utli.*;
// public class pattern {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if ((i==1)||(i==2&&j!=5)||(i==3&&j!=4&&j!=5)||(i==4&&j==2||j==1)||(i==1&&j==1)) {
//                     System.out.print(j);
                    
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.*;
// public class pattern {

//     public static void hollow_Ractangle(int totRow,int totCol){
//         for(int i=1;i<=totRow;i++){
//             for(int j=1;j<=totCol;j++){
//                 if(i==1||i==totRow||j==1||j==totCol){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }
//     }
//    public static void main(String[] args) {
//     hollow_Ractangle(40, 50);
//    }
// }
// import java.util.*;
// public class pattern {

//     public static void inverted_pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();    
//             }
            
            
//     }
    
//     public static void main(String[] args) {
//         inverted_pattern(25);
//     }
// }
import java.util.*;
public class pattern {

    public static void kfdj(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);          
              }
              System.out.println();
        }
    }
    public static void main(String[] args) {
        kfdj(5);
    }
}
