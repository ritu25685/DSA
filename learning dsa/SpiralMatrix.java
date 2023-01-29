public class SpiralMatrix {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;
        while(startRow<= endRow && startcol<=endcol){
            for(int i =startcol;i<=endcol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
           
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int i = endcol-1;i>=startcol;i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            
            for(int i = endRow-1;i>=startRow+1;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startRow++;
            startcol++;
            endRow--;
            endcol--;
            

        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix);
    }
    
}
