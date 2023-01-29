public class GridWay {
    public static int gridway(int i,int j, int m,int n){
        if(i==m-1 || j == n-1){
            return 1;

        }
        else if(n==0 || m==0){
            return 0;
        }
        int w1 = gridway(i,j+1,m,n);
        int w2 = gridway(i+1,j,m,n);
        return w1+w2;
    }
    public static void main(String[] args){
        int m=3,n=4;
        System.out.println(gridway(0,0,m,n));

    }
    
}
