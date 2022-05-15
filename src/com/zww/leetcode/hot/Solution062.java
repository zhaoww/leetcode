package com.zww.leetcode.hot;

/**
 * 62. 不同路径
 *
 * @author 半山兄
 * @since 2022/05/15
 */
public class Solution062 {
    /**
     * 动态规划
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            ans[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            ans[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i][j - 1];
            }
        }
        return ans[m - 1][n - 1];
    }
}
