public class sumOfDigits {
    public static void sum(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum =sum+lastDigit;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        sum(123);
    }
    
}
