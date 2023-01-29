public class DiagonalMatrix {
    
    public static void main(String[] args){
        int matrix[][] = {{1,2},{3,4}};
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }
}
