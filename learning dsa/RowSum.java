public class RowSum {
    public static void sum(int matrix[][]){
        int sum =0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        sum(matrix);
    }
    
}
