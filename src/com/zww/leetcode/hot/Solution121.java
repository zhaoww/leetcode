package com.zww.leetcode.hot;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author weiwei.zhao
 * @since 2022/04/25
 */
public class Solution121 {
    /**
     * 遍历一轮找最小值和计算差值
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            maxProfit = Math.max(prices[i] - min, maxProfit);
        }
        return maxProfit;
    }
}
