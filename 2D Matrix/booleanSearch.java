public class booleanSearch {
    public static boolean search(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println("found at cell"+"("+i+ ","+j+")");
                    return true;
                    
                }
            }
        }
        System.out.println("key is not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                       {4,5,6,},
                       {6,7,8}};
                       
int key=8;
search(matrix, key);
    }
    
}
