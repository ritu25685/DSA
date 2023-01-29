import java.util.*;
public class Fever {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("You are sick");
        }else{
            System.out.println("You are absolutely perfect");
        }

    }
    
}
