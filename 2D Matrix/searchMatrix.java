class searchMatrix {
    public static boolean search_Matrix(int[][] matrix, int target) {
         int row=matrix.length-1;
        int col=-0;
        while(row>=0&&col<=matrix[0].length-1){
            if(matrix[row][col]==target){
                System.out.println("found at "+row+","+col);
                return true;
            }
            if(matrix[row][col]>target){
                row--;

            }
            else{
                col++;
            }
        } 
        System.out.println("key not found");
        return false;
        
    }
    public static void main(String args[]){
        int matrix[][]={{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};
        int target=3;
        
           search_Matrix(matrix, target);          
    }
}