public class SelectionSorting {
    public static void main(String[] args){
        int arr[] = {2,4,1,8,3};
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
