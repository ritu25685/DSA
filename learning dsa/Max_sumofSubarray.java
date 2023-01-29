public class Max_sumofSubarray {
    public static void prefix_sum(int[] arr){
        int pre_sum = 0;
        int start = arr[0];
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum = start == 0 ? prefix[j]:prefix[j]-prefix[i];
                if(currsum>pre_sum){
                    pre_sum = currsum;
                }
            }
        }
        System.out.println("maximum sum of array : "+pre_sum);
    }
    public static void main(String[] args){
        int[] arr = {1,-2,6,-1,3};
        prefix_sum(arr);
        
        

    }
    
}
