import java.util.*;
public class Sorting {
    public static void bubbleSorting(int arr[]){
        for(int pass = 0;pass<arr.length;pass++){
            for(int j=0;j<arr.length-pass-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            
            }
        }
    
    }
    public static void SelectionSorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void countingsort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        }
    }
    public static void main(String[] args){
        Integer arr[] = {2,1,5,3,0};
        Arrays.sort(arr);
        Arrays.sort(arr,0,3,Collections.reverseSort());

        //insertionsort(arr);
        
    }
    
}
