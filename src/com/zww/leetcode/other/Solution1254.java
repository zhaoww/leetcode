package com.zww.leetcode.other;

/**
 * 1254. 统计封闭岛屿的数目
 *
 * @author weiwei.zhao
 * @since 2022/08/17
 */
public class Solution1254 {
    int m, n;

    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    if (dfs(grid, i, j)) ans++;
                }
            }
        }
        return ans;
    }

    public boolean dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n) return false;
        if (grid[i][j] == 1) return true;

        grid[i][j] = 1;
        boolean up = dfs(grid, i - 1, j);
        boolean down = dfs(grid, i + 1, j);
        boolean left = dfs(grid, i, j - 1);
        boolean right = dfs(grid, i, j + 1);
        return up && down && left && right;
    }

    public static void main(String[] args) {
        new Solution1254().closedIsland(new int[][]{{1, 1, 1, 1}, {0, 0,0, 1}, {1, 1, 1,1}});

//        new Solution1254().closedIsland(new int[][]{{0, 0, 1, 1, 0, 1, 0, 0, 1, 0}, {1, 1, 0, 1, 1, 0, 1, 1, 1, 0}, {1, 0, 1, 1, 1, 0, 0, 1, 1, 0}, {0, 1, 1, 0, 0, 0, 0, 1, 0, 1}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}, {0, 1, 0, 1, 0, 1, 0, 1, 1, 1}, {1, 0, 1, 0, 1, 1, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 1, 0, 1, 0, 1}, {1, 1, 1, 0, 1, 1, 0, 1, 1, 0}});
    }
}
