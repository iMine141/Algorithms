package Leetcode.array;

/**
 * @author wym
 */
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }
        int n = prices.length;
        int dp_i_0 = 0; int dp_i_1 = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            int tmp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,  tmp-prices[i]);
        }
        return dp_i_0;
    }
}
