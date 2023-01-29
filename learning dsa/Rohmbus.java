import java.util.*;
public class Rohmbus {
    public static void palindrome(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>1;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        

    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        //char ch = 'A';
        //int counter = 1;
       /*  for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }*/
        palindrome(n);
        //diamond(n);
    }
    
}
