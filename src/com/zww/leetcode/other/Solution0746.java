package com.zww.leetcode.other;

/**
 * 746. 使用最小花费爬楼梯
 *
 * @author 半山兄
 * @since 2022/05/19
 */
public class Solution0746 {
    public static void main(String[] args) {
        new Solution0746().minCostClimbingStairs(new int[]{10, 15, 20});
    }

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len];
    }
}
