import java.util.*;
public class deciTobin{
    public static void DtoB(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            int rem = n%2;
            bin = bin +rem*(int)(Math.pow(10,pow));
            pow++;
            n = n/2;

            
        }
        System.out.println("binary form of a number : "+bin);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DtoB(n);
        
    }
}
