public class RecursionPractice {
    public static void Occurance(int[] arr, int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i);
        }
        Occurance(arr,key,i+1);
        
    }
    static String arr[] = {"zero","one","two" ,"three","four", "five","six","seven","eight","nine","ten" };
    public static void NtoS(int number){
        if(number==0){
            return;
        }
        int lastdigit = number%10;
        NtoS(number/10);
        System.out.print(arr[lastdigit]+" ");

    }
    public static int lenofstr(String  str){
        if(str.length()==0){
            return 0;
        }
        return lenofstr(str.substring(1))+1;
    }
    public static int StartEnd(String str){
        for(int i=1;i<str.length();i++){
            StartEnd(str.substring(i));
        }
    }
    public static void main(String[]args){
        //int[] arr = {3,2,5,2,7,2,2};
        //Occurance(arr,2,0);
        //System.out.println(lenofstr("absds"));
        NtoS(1234);
    }
    
}
