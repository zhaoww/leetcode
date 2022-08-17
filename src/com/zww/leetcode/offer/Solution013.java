package com.zww.leetcode.offer;

/**
 * 剑指 Offer 13. 机器人的运动范围
 *
 * @author weiwei.zhao
 * @since 2022/05/16
 */
public class Solution013 {

    public int movingCount(int m, int n, int k) {
        int[][] grid = new int[m][n];
        return backtrace(grid, m, n, 0, 0, k);
    }

    private int backtrace(int[][] grid, int m, int n, int i, int j, int k) {
        if (i >= m || i < 0 || j >= n || j < 0 || getSum(i) + getSum(j) > k || grid[i][j] == 1) {
            return 0;
        } else {
            grid[i][j] = 1;
            // 右 下 左 上
            return 1 + backtrace(grid, m, n, i + 1, j, k) + backtrace(grid, m, n, i, j + 1, k);
            // 优化 只处理两个方向
//                    + backtrace(grid, m, n, i - 1, j, k) + backtrace(grid, m, n, i, j - 1, k);
        }
    }

    public int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        new Solution013().movingCount(1, 2, 1);
    }

}
