package com.zww.leetcode.other;

/**
 * 931. 下降路径最小和
 *
 * @author weiwei.zhao
 * @since 2022/07/22
 */
public class Solution0931 {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }
        if (m == 1){
            for (int j = 0; j < n; j++) {
                ans = Math.min(ans, dp[0][j]);
            }
            return ans;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + matrix[i][j];
                } else if (j == n - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + matrix[i][j];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]) + matrix[i][j];
                }
                // 找出最后一行 最小的dp值
                if (i == m - 1) {
                    ans = Math.min(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
}
