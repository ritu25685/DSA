import java.util.*;
public class AdvancedPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(i==0 || i==rows-1 || j==0 || j == column-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
