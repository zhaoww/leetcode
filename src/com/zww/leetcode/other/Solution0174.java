package com.zww.leetcode.other;

/**
 * 174. 地下城游戏
 *
 * @author weiwei.zhao
 * @since 2022/08/12
 */
public class Solution0174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        int[][] dp = new int[m][n];
        dp[m - 1][n -1] = Math.max(0, -dungeon[m - 1][n - 1]) + 1;

        for (int i = m - 2; i >= 0; --i) {
            int min = dp[i + 1][n - 1] - dungeon[i][n - 1];
            dp[i][n -1] = Math.max(0, min);
        }

        for (int i = n - 2; i >= 0; --i) {
            int min = dp[m - 1][i + 1] - dungeon[m - 1][i];
            dp[m - 1][i] = Math.max(0, min);
        }

        for (int i = m - 2; i >= 0; --i) {
            for (int j = n - 2; j >= 0; --j) {
                int min = Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j];
                dp[i][j] = Math.max(0, min);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        new Solution0174().calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}});
    }
}
