public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]>=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void main(String[] args){
        int[] arr = {3,4,5,6,0,1,2};
        quickSort(arr,0,arr.length-1);

    }
    
}
