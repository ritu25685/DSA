import java .util.*;
public class Reverse_num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int last_digit = n%10;
            n=n/10;
            rev = (rev*10+last_digit);
        }
        System.out.println(rev);
    }
}