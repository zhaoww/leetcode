package com.zww.leetcode.other;

/**
 * 50. Pow(x, n)
 *
 * @author 半山兄
 * @since 2022/06/19
 */
public class Solution0050 {
    public double myPow(double x, int n) {
        double ans = 1.0d;
        long l = (long) n;
        if (n < 0) {
            x = 1 / x;
            l = -l;
        }

        while (l > 0) {
            if (l % 2 == 1) ans *= x;
            x *= x;
            l /= 2;
        }
        return ans;
    }
}
