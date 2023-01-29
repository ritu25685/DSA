import java.util.*;
public class practice {
   /*  public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }*/
    public static void subset(String str,String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        subset(str,ans+str.charAt(i),i+1);
        subset(str,ans,i+1);
    }
    public static void permutation(String str, String ans){
        
    }
    public static void main(String[] args){
        //int arr[] = {2,3,1,4,5};
        //subarray(arr);
        subset("abc"," ",0);

    }
    
}
