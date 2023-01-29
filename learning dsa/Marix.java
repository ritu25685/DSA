
import java.util.*; 
public class Marix {
    //public static void search(int matrix[][],int key)
    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int m= 3,n = 3;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    
}
