import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search : ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index "+ i);
                break;
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }

    }
    
}
