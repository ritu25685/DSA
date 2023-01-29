public class SearchinSortedMatrix {
    //int[][] matrix ={{10,20,30,40},{15,25,35,45},{22,32,42,52}};
    public static boolean search(int[][] matrix,int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>0){
            if(matrix[row][col] == key){
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
       
        
        return false;
    }
    public static void count(int matrix[][],int key){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
                
            }
        }
        System.out.println(count);
    }
        public static void main(String[] args){
            int[][] matrix = {{4,7,8},{7,7,8}};
            System.out.println(search(matrix,7));
            count(matrix,7);
            
        }
    }

    

