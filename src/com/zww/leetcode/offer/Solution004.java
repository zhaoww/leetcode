package com.zww.leetcode.offer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * @author weiwei.zhao
 * @since 2022/04/18
 */
public class Solution004 {
    /**
     * 暴力解法 加限制条件遍历
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] matrixi = matrix[i];
            for (int j = 0; j < matrixi.length; j++) {
                if (matrixi[j] > target) break;
                if (matrixi[j] == target) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3, 5},
                {4, 5, 6, 10},
                {7, 8, 9, 22},
                {10, 11, 12, 66}
        };
        System.out.println(new Solution004().findNumberIn2DArray(a, 19));
    }
}
