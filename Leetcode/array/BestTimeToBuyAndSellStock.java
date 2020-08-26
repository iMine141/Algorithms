package Leetcode.array;

import java.util.Arrays;

/**
 * @author wym
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }
        int n = prices.length;
        int dp_i_0 = 0; int dp_i_1 = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){

            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,  -prices[i]);
        }
        return dp_i_0;
    }
}
