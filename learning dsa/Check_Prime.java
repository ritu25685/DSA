import java.util.*;
public class Check_Prime {
    /*  public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==2){
            System.out.println(n+" is a prime number");
        }else{
            for(int i=2;i<n-2;i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
               System.out.println(n+" is a prime number");
        
            }else{
                System.out.println(n+" is not a prime number");
            }
            
        }

    }
    
}
