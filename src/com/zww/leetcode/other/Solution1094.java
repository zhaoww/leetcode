package com.zww.leetcode.other;

/**
 * 1094. 拼车
 *
 * @author weiwei.zhao
 * @since 2022/06/28
 */
public class Solution1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = 1001;
        int[] c = new int[1001];
        for (int[] trip : trips) {
            c[trip[1]] += trip[0];
            if (trip[2] < n) {
                c[trip[2]] -= trip[0];
            }
        }
        if (c[0] > capacity) return false;
        for (int i = 1; i < n; i++) {
            c[i] += c[i - 1];
            if (c[i] > capacity) return false;
        }
        return true;
    }
}
