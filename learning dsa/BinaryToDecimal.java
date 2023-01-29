public class BinaryToDecimal {
    public static void bintodeci(int binNum){
        int dec =0;
        int pow = 0;
        while(binNum>0){
            int l = binNum%10;
            dec = dec +(l*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;

        }
        System.out.println(dec);
        
    }
    public static void main(String[] args){
        bintodeci(101);

    }
        
        
    
    
}
