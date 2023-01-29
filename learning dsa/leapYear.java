import java.util.*;
public class leapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean x = (num%4) == 0;
        boolean y = (num%100) !=0;
        boolean z = ((num%100)==0 && (num%400)==0);
        if(x && (y||z)){
            System.out.println(num+ "  is a year.");
        }
        else{
            System.out.println(num+" is not a leap year");
        }

    }
    
}
