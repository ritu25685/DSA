public class Subarray {
    public static void main(String[] args){
        int arr[] = {3,4,5,1,7,9};
        int t_sub = 0;
        int sum = 0;
        int max_sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");//Brute force technique
                    sum+=arr[k];
                    t_sub++;
                    
                }
                if(sum>max_sum){
                    max_sum = sum;
                }
                System.out.println();
            }
            System.out.println(sum);
            System.out.println();
        }
        System.out.println("Total no. of subarray : "+t_sub);
        System.out.println("Maximum sum is :"+max_sum);
        
        
    }
    
}
