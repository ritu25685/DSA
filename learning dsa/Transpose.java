public class Transpose {
    public static void Transpose(int matrix[][]){
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int[][] transpose = new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);

            }
        }
    }
    public static void main(String[] args){
        int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Transpose(matrix);
    }
    
}
