import java.util.*;
public class SquareMatrix {
    public static void minisquare(int matrix[][], int m,int n){
        int sum = 0;
        if(m==1 && n==1){
            System.out.println(sum+m*n);
        }
        sum = sum + m*n;
        minisquare(matrix,m-1,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        minisquare(matrix,5,4);

    }
    
}
