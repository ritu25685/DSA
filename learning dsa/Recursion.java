public class Recursion {
    public static void printnum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printnum(n-1);

    }
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fn1 = n*factorial(n-1);
        return fn1;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int nsum = n+sum(n-1);
        return nsum;
    }
    public static int fibb(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibb1 = fibb(n-2)+fibb(n-1);
        return fibb1;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }
    public static int FirstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurance(arr,key,i+1);
    }
    public static int LastOccurance(int arr[] ,int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = LastOccurance(arr,key,i+1);
        if(isfound!=-1){
            return isfound;
        } 
        if(arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(a,n-1);
        int xn = a*power(a,n-1);
        return xn;
    }
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpowersqr = optimizedPower(a, n/2);
        halfpowersqr = halfpowersqr*halfpowersqr;
        if(n%2!=0){
            halfpowersqr=a*halfpowersqr;
        }
        return halfpowersqr; //t(n) = O(logn)

    } 
    public static void main(String[] args){
        printinc(10);
        System.out.println(sum(10));
        System.out.println(factorial(5));
        

    }
    
}
