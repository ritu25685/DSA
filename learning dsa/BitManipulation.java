import java.util.*;
public class BitManipulation {
    public static void OddEven(int n){
        int bitMask = 1;
        if((n & bitMask)==1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }

    }
    public static int GetIthbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1;
        return n| bitMask;
    }
    public static int clearIthBit(int n, int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }
    public static int updateBit(int newBit,int i,int n){
        /*if(newBit== 0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }*/
        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;

    }
    public static int clearithBit(int n, int i){
        int BitMask = (-1)<<i;
        return n & BitMask;
    }
    public static int clearBitsinrange(int n, int i,int j){
        int a = (-1)<<j+1;
        int b = (1<<i)-1;
        int BitMask = a | b;
        return n & BitMask;
    }
    public static boolean numberpower2(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countsetBit(int n){
        int count =0;
        while(n>0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args){
        OddEven(11);
        OddEven(12);
        System.out.println(GetIthbit(5,2));
        System.out.println(setIthBit(5,2));
        System.out.println(clearIthBit(5,2));
        System.out.println(updateBit(1,2,10));
        System.out.println(clearithBit(7,2));
        System.out.println(clearBitsinrange(10,1,3));
        System.out.println(countsetBit(15));
    }    
    
}
