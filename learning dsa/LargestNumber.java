public class LargestNumber {
    public static void main(String[] args){
        int[] arr = {4, 6,23,45,1,99,12};
        int largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
