package com.zww.leetcode.hot;

/**
 * 70. 爬楼梯
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution070 {
    /**
     * 递归超时
     * climbStairs(n - 1) + climbStairs(n - 2)
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 2, c = 0;
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        new Solution070().climbStairs(10);
    }
}
