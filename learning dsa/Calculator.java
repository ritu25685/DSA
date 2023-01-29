import java.util.*;
public class Calculator{
    public static void main(String[] args){
        System.out.println("1 for Addition\n2 for substraction\n3 for multiplication\n4 for division\n5 for modulo ");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(operation){
            case 1:System.out.println(a+b);
                      break;
            case 2:System.out.println(a-b);
                     break;
            case 3:System.out.println(a*b);
                break;
            case 4:System.out.println(a/b);
                   break;
            case 5:System.out.println(a%b);
                    break;
            default:System.out.println("operation not found");



        }

    }
}