public class functionOverloadingwithDatatype {
    public static int sum(int x, int y){
        return x+y;
    }
    public static float sum(float x, float y){
        return (x+y);
    }
    public static void main(String[] args){
        System.out.println(sum(2,3));
        System.out.println(sum(5f,3f));
    }
    
}
