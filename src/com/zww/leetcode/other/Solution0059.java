package com.zww.leetcode.other;

/**
 * 59. 螺旋矩阵 II
 *
 * @author weiwei.zhao
 * @since 2022/07/01
 */
public class Solution0059 {
    public int[][] generateMatrix(int n) {
        int up = 0, down = n - 1, left = 0, right = n - 1;
        int[][] ans = new int[n][n];
        int val = 0;
        while (val < n * n) {
            if (up <= down) {
                for (int i = left; i <= right; i++) {
                    ans[up][i] = ++val;
                }
                up++;
            }
            if (left <= right) {
                for (int i = up; i <= down; i++) {
                    ans[i][right] = ++val;
                }
                right--;
            }
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    ans[down][i] = ++val;
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    ans[i][left] = ++val;
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution0059().generateMatrix(3);
    }
}
