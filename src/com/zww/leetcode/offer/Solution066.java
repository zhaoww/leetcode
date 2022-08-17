package com.zww.leetcode.offer;

/**
 * 剑指 Offer 66. 构建乘积数组
 *
 * @author weiwei.zhao
 * @since 2022/06/17
 */
public class Solution066 {
    public int[] constructArr(int[] a) {
        int len = a.length;
        if (len == 0) return a;
        int b[] = new int[len];
        b[0] = 1;
        // 下三角形
        for (int i = 1; i < len; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }

        // 上三角形
        int tmp = 1;
        for (int i = len - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }
}
