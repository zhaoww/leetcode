package com.zww.leetcode.other;

/**
 * 64. 最小路径和
 *
 * @author weiwei.zhao
 * @since 2022/05/16
 */
public class Solution0064 {
    /**
     * dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+ grid[i][j]
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int ilen = grid.length, jLen = grid[0].length;
        for (int i = 0; i < ilen; i++) {
            for (int j = 0; j < jLen; j++) {
                if (i != 0 && j != 0) {
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                } else if (i == 0 && j != 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (i != 0 && j == 0) {
                    grid[i][j] += grid[i - 1][j];
                }
            }
        }

        return grid[ilen - 1][jLen - 1];
    }

    public static void main(String[] args) {
        new Solution0064().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}, {4, 2, 1}});
    }
}
