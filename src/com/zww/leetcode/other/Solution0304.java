package com.zww.leetcode.other;

/**
 * 304. 二维区域和检索 - 矩阵不可变
 * https://leetcode.cn/problems/range-sum-query-2d-immutable/solution/ru-he-qiu-er-wei-de-qian-zhui-he-yi-ji-y-6c21/
 *
 * @author weiwei.zhao
 * @since 2022/06/28
 */
public class Solution0304 {
    int[][] preSums;

    public Solution0304(int[][] matrix) {
        int leni = matrix.length;
        int lenj = matrix[0].length;
        preSums = new int[leni + 1][lenj + 1];
        for (int i = 1; i <= leni; i++) {
            for (int j = 1; j <= lenj; j++) {
                preSums[i][j] = preSums[i-1][j] + preSums[i][j-1] + matrix[i - 1][j - 1] - preSums[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return preSums[row2+1][col2+1] - preSums[row1][col2+1] - preSums[row2+1][col1] + preSums[row1][col1];
    }
}
