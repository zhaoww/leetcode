package com.zww.leetcode.offer;

/**
 * 剑指 Offer 63. 股票的最大利润
 *
 * @author weiwei.zhao
 * @since 2022/06/17
 */
public class Solution063 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int len = prices.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(prices[i], min);
            ans = Math.max(prices[i] - min, ans);
        }

        return ans;
    }
}
