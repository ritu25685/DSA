public class pairArray {
    public static void main(String[] args){
        int total_pair = 0;
        int[] arr = {3,4,2,5,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println(total_pair);
    }
    
}
