package com.zww.leetcode.offer;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 *
 * @author 半山兄
 * @since 2022/06/02
 */
public class Solution029 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 1}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        new Solution029().spiralOrder(arr);
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int lenI = matrix.length;
        int lenJ = matrix[0].length;
        int ans[] = new int[lenI * lenJ];

        int startI = 0, endI = lenJ - 1, startJ = 1, endJ = lenI - 1;
        int ansI = 0;
        int startI2 = 0, endI2 = 0, startJ2 = 0, endJ2 = 0;
        int curI = 0, curJ = lenJ - 1, curI2 = lenI - 1, curJ2 = 0;

        while (ansI < ans.length) {
            // 右
            for (int i = startI; i <= endI; i++) {
                ans[ansI++] = matrix[curI][i];
            }

            // 下
            for (int j = startJ; j <= endJ && ansI < ans.length; j++) {
                ans[ansI++] = matrix[j][curJ];
            }

            // 左
            startI2 = endI - 1;
            endI2 = startI;
            for (int i = startI2; i >= endI2 && ansI < ans.length; i--) {
                ans[ansI++] = matrix[curI2][i];
            }

            // 上
            startJ2 = endJ - 1;
            endJ2 = startJ;
            for (int j = startJ2; j >= endJ2 && ansI < ans.length; j--) {
                ans[ansI++] = matrix[j][curJ2];
            }

            // 调整坐标
            // 右
            startI++;
            endI--;
            curI++;
            // 下
            startJ++;
            endJ--;
            curJ--;
            // 左
            curI2--;
            // 上
            curJ2++;

        }
        return ans;
    }
}
