package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 322. ¡„«Æ∂“ªª
 *
 * @author weiwei.zhao
 * @since 2022/07/21
 */
public class Solution0322 {
    int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -999);
        return dpFunc(coins, amount);
    }

    private int dpFunc(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (dp[amount] != -999) return dp[amount];
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = dpFunc(coins, amount - coin);
            if (sub == -1) continue;
            ans = Math.min(ans, sub + 1);
        }
        dp[amount] = ans == Integer.MAX_VALUE ? -1 : ans;
        return dp[amount];
    }

    public static void main(String[] args) {
        new Solution0322().dpFunc(new int[]{1, 2, 5}, 13);
    }
}
