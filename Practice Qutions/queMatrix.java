public class queMatrix {
    public static int searchMatrix(int mat[][],int target){
        int count=0;
        for ( int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==7){
                    count++;
                }
                
            }
        }
        return count;
        
    }
    public static int sumMatrix(int mat[][]){
        int sum=0;
        for(int j=0;j<mat[0].length;j++){
            sum+=mat[1][j];
        }
        return sum;
    }
    public static void tarsportMatrix(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
              
                System.out.println(mat[j][i]);
                 
            }
        }
       
    }
    public static void printArr(int mat[][]){
        for (int i = 0; i <= mat.length; i++) {
            for (int j = 0; j <mat[0].length-1; j++) {
                System.out.print(mat[j][i]+" ");
            }
             System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int mat[][]={{1,4,9},{11,4,3} };
        int target=7;
        printArr(mat);
        
    }
    
}
