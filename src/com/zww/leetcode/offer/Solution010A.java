package com.zww.leetcode.offer;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 *
 * @author weiwei.zhao
 * @since 2022/04/22
 */
public class Solution010A {
    public int fib(int n) {
        if (n < 2) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        new Solution010A().fib(45);
    }
}
