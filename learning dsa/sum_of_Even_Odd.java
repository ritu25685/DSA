import java.util.*;
public class sum_of_Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even_sum=0;
        int odd_sum = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even_sum+=i;
            }else{
                odd_sum+=i;
            }
        }
        System.out.println("sum of even number "+even_sum);
        System.out.println("sum of even number "+odd_sum);
    }
    
}
