package com.zww.leetcode.hot;

/**
 * 322. 零钱兑换 TODO
 *
 * @author weiwei.zhao
 * @since 2022/04/28
 */
public class Solution322 {

    int[] memo;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins.length == 0) return -1;
        memo = new int[amount];
        int ans = search(coins, amount, 0);
        return ans;
    }

    public int search(int[] coins, int amount, int cnt) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;

        if (memo[amount - 1] != 0) {
            return memo[amount - 1];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = search(coins, amount - coins[i], cnt + 1);
            if (res >= 0 && res < ans) {
                ans = res + 1;
            }
        }
        memo[amount - 1] = (ans == Integer.MAX_VALUE ? -1 : ans);
        return memo[amount - 1];

    }

    public static void main(String[] args) {
        new Solution322().coinChange(new int[]{1, 2, 5}, 11);
    }
}
