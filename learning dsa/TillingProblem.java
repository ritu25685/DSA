public class TillingProblem {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertically place
        int fnm1 = tiling(n-1);
        int fnm2 = tiling(n-2);
        int tottile = fnm1+fnm2;
        return tottile;
    }
    public static void main(String[] args){
        System.out.println(tiling(3));

    }
    
}
