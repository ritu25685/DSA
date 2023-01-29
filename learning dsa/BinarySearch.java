public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {4,8,12,16,18};
        int low = 0;
        int high = arr.length-1;
        int mid = ((high+low)-low)/2;
        int num = 12;
        if(arr[mid]==num){
            System.out.println("Number found");
        }
        else if(arr[mid]<num){
            low = mid+1;
        }
        else if(arr[mid]>num){
            high = mid-1;
        }
    }
}
