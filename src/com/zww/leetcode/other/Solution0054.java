package com.zww.leetcode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 *
 * @author 半山兄
 * @since 2022/06/30
 */
public class Solution0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int up = 0, down = m - 1, left = 0, right = n - 1;
        List<Integer> ansList = new ArrayList<>();
        while (ansList.size() < m * n) {
            if (up <= down) {
                for (int i = left; i <= right; i++) {
                    ansList.add(matrix[up][i]);
                }
                up++;
            }
            if (left <= right) {
                for (int i = up; i <= down; i++) {
                    ansList.add(matrix[i][right]);
                }
                right--;
            }
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    ansList.add(matrix[down][i]);
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    ansList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ansList;
    }
}
