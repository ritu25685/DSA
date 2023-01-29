import java.util.Arrays;
public class SquareOfSortedArray {
    public static int[] squareArray(int[] nums){
        int sqr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sqr[i] = nums[i]*nums[i];
        }
        Arrays.sort(sqr);

        return sqr;
    }
    public static void main(String[] args){
        int arr[] = {-3,0,1,3,4};
        arr = squareArray(arr);
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        

    }
    
}
