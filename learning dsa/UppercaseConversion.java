import java.util.*;
public class UppercaseConversion {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(str);
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1)
            sb.append(str.charAt(i));
            sb.append(i);
            i++;
            sb.append(Character.toUpperCase(i));
        }

    }
    public static void main(String[] args){
        String str = "hello india";
    }
    
}
