package com.zww.leetcode.offer;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数
 *
 * @author 半山兄
 * @since 2022/05/29
 */
public class Solution017 {
    public int[] printNumbers(int n) {
        int len = (int) Math.pow(10, n) - 1;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
