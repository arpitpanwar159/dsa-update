import java.util.*;

 class output {
    
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner c=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=c.nextInt();

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        c.close();

        
    }
    
}
