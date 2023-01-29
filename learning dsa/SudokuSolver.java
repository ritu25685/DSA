public class SudokuSolver{
    public static boolean isSafe(sudoku[][], int row, int col, int digit){
        if(sudoku[row][col]==digit)
    }
    public static boolean sudokusolver(int sudoku[][],int row, int col){
        if(row==9 && col==9){
            return true;
        }else if(row==9){
            return false;
        }


        int nextRow = row, nextcol = col+1;
        if(nextcol == 9){
            nextRow = row+1;
            nextcol = 0;
        }
        if(sudoku[row][col]!=0){
            sudokusolver(sudoku,nextRow,nextcol);
        }
        for(int digit =1;digit<=9;digit++){
            if(isSafe(sudoku[][],row,col,digit)){
                sudoku[row][col]=digit;
                sudokusolver(sudoku,nextRow,nextcol);
            }
        }
    }
    public static void main(String[] args){
        int sudoku = {{0,0,0,1,}}
    }
    
}