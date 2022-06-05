package com.zww.leetcode.other;

/**
 * 509. 斐波那契数
 *
 * @author 半山兄
 * @since 2022/05/18
 */
public class Solution0509 {

    public int fib(int n) {
        if (n < 2) return n;
        int ans = 0;
        int pre = 1;
        int p = 0;
        for (int i = 2; i <= n; i++) {
            ans = pre + p;
            p = pre;
            pre = ans;
        }
        return ans;
    }
}
