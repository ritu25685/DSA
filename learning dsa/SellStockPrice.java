import java.util.*;
public class SellStockPrice {
    public static int buyAndStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){
                int profit = price[i]-buyPrice;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,2};
        System.out.println(buyAndStocks(prices));
    }
    
}
