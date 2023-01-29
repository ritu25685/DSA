public class Substring {
    public static void FindSet(String str, String ans, int i){
        if(i==str.length()){
            if(str.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //Recursion
        //Yes
        FindSet(str,ans+str.charAt(i),i+1);
        //No
        FindSet(str,ans,i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        FindSet(str,"",0);
    }
    
}
