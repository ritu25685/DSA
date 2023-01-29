import java.util.*;
public class KadanesAlgo {
    public static void kadane_sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int currsum = 0;
    
        for(int j = 0;j<arr.length;j++){
            currsum = currsum+arr[j];
            
            if(currsum > max_sum){
                max_sum = currsum;
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args){
        int[] arr ={ 1,-2,6,7,2};
        kadane_sum(arr);

    }
    
}
