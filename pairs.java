import java.util.*;
public class pairs {
    public static void pairFun(int num[]){
        int tp=0;
        for (int i=0;i<=num.length-1;i++){
         for(int j=i+1;j<=num.length-1;j++){
            int curr=num[i];
            System.out.print("("+curr+","+num[j]+")");
            tp++;
           
        }
         System.out.println();
         
    }
    System.out.println(tp);
}

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pairFun(num);

    }
}