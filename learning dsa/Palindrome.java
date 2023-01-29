public class Palindrome {
  /*   public static boolean pdCheck(int n){
        int pow = 0;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev +lastdigit*(int)Math.pow(10,pow);
            pow++;
            n=n/10;
        }
        if(rev == n){
            return true;

        }
        return false;
        
    }*/
    public static boolean palindrm(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(palindrm("121"));
    
    }
    
}
