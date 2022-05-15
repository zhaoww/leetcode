package com.zww.leetcode.other;

/**
 * 63. 不同路径 II
 *
 * @author 半山兄
 * @since 2022/05/15
 */
public class Solution0063 {
    public static void main(String[] args) {
        new Solution0063().uniquePathsWithObstacles(new int[][]{{1, 0}});
    }

    /**
     * 动态规划
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            // 后续节点均为0
            if (obstacleGrid[i][0] == 1) break;
            ans[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            // 后续节点均为0
            if (obstacleGrid[0][i] == 1) break;
            ans[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ans[i][j] = obstacleGrid[i][j] == 1 ? 0 : ans[i - 1][j] + ans[i][j - 1];
            }
        }
        return ans[m - 1][n - 1];
    }
}
