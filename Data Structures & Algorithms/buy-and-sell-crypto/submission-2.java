class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int curmin = prices[0];
        for(int i = 0;i<prices.length;i++){
            res = Math.max(res,prices[i]-curmin);
            if(prices[i] < curmin){curmin = prices[i];}
        }
        return res;
        
    }
}
