public class Swapping {
    public static void swap(int a ,int b){
        System.out.println(a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);


    }
    public static void main(String[] args){
        
        swap(2,3);

    }
    
}
