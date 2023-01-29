public class ReverseArray {
    /*  public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }*/
    public static void RotateArr(int a[], int k){
        int n = a.length;
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    
       
    }
    public static void reverse(int arr[],int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8};
        RotateArr(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
}
