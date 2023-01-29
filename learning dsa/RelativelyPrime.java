import java.util.*;
public class RelativelyPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Yes");
        for(int i=a;i<=b;i+=2){
            System.out.println(i+" "+(i+1));
        }

    }
    
}
