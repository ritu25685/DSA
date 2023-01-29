import java.util.*;
public class BionomialCoeficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int BinCoeficient(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);
        int result = n_fact/(r_fact*n_r_fact);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(BinCoeficient(n,r));
        
    }
}
