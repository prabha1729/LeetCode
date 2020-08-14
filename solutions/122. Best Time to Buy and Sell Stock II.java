// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit=0;
//         for(int i=0;i<prices.length-1;i++){
//             if(prices[i]<prices[i+1]){
//                 profit = profit+(prices[i+1]-prices[i]);
//             }
//         }
//         return profit;
//     }
// }
​
class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            if (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            if (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
