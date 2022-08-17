package com.zww.leetcode.other;

/**
 * 463. µ∫”Ïµƒ÷‹≥§
 *
 * @author weiwei.zhao
 * @since 2022/08/15
 */
public class Solution0463 {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // left
                    if (j == 0 || grid[i][j - 1] == 0)
                        ans++;
                    // right
                    if (j == n - 1 || grid[i][j + 1] == 0)
                        ans++;
                    // top
                    if (i == 0 || grid[i - 1][j] == 0)
                        ans++;
                    // bottom
                    if (i == m - 1 || grid[i + 1][j] == 0)
                        ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution0463().islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});
    }
}
