package com.zww.leetcode.other;

/**
 * 1137. 第 N 个泰波那契数
 *
 * @author weiwei.zhao
 * @since 2022/05/20
 */
public class Solution1137 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int t0 = 0, t1= 1, t2 = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = t0;
            t0 = t1;
            t1 = t2;
            t2 = tmp + t0 + t1;
        }
        return t2;
    }
}
