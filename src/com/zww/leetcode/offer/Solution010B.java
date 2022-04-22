package com.zww.leetcode.offer;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 *
 * @author weiwei.zhao
 * @since 2022/04/22
 */
public class Solution010B {
    public int numWays(int n) {
        if (n < 2) return 1;
        int a = 1, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        new Solution010B().numWays(45);
    }
}
