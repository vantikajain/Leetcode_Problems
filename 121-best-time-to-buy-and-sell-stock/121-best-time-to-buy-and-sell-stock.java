class Solution {
    public int maxProfit(int[] prices) {
       int BuyPrice=Integer.MAX_VALUE; //Min price to buy
       int currProfit=0;  //profit if sold today
       int Totalprofit=0;  // overall profit
        
        for(int i=0;i<prices.length;i++){
             if(prices[i]<BuyPrice){
                 BuyPrice=prices[i];
             }
            currProfit=prices[i]-BuyPrice;
            if(currProfit>Totalprofit){
                Totalprofit=currProfit;
            }
        }
        return Totalprofit;
    }
}