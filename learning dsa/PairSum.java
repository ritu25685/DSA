public class PairSum {
    public static boolean pairsum(int[] arr, int target){
        int lp =0;
        int rp = arr.length-1;
        int sum = arr[lp]+arr[rp];
        while(lp<rp){
            if(sum == target){
                return true;
            }
            else if(sum < target){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {1,2,4,5,6,7};
        int target = 3;
        System.out.println(pairsum(arr, target));

    }
    
    
}
