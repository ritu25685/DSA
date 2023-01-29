public class FunctionOverloadingParameter {
    public static int fun1(int x, int y){
        return x+y;
    }
    public static int fun1(int x, int y,int z){
        return x+y+z;
    }
   public static void main(String[] args){
    System.out.println(fun1(2,3));
    System.out.println(fun1(2,3,5));

   }

    
}
