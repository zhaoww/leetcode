package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 72. 编辑距离
 *
 * @author 半山兄
 * @since 2022/07/23
 */
public class Solution0072 {
    int[][] dp;

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return dpFunc(word1, word2, m - 1, n - 1);
    }

    public int dpFunc(String word1, String word2, int i, int j) {
        if (i == -1) return j + 1;
        if (j == -1) return i + 1;
        // 查备忘录，避免重叠子问题
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (word1.charAt(i) == word2.charAt(j)) {
            dp[i][j] = dpFunc(word1, word2, i - 1, j - 1);
        } else {
            dp[i][j] = 1 + min(dpFunc(word1, word2, i - 1, j - 1), // 替换
                    dpFunc(word1, word2, i - 1, j), // 删除
                    dpFunc(word1, word2, i, j - 1)); // 插入
        }
        return dp[i][j];
    }

    public int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
