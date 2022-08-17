package com.zww.leetcode.offer;

/**
 * 剑指 Offer 16. 数值的整数次方
 *
 * @author weiwei.zhao
 * @since 2022/05/31
 */
public class Solution016 {
    /**
     * 快速幂
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if (x == 0 || x == 1) return x;
        double ans = 1;
        long nl = n;
        if (n < 0) {
            x = 1 / x;
            nl = -nl;
        }
        while (nl > 0) {
            if (nl % 2 == 1) ans *= x;
            x *= x;
            nl /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution016().myPow(2d, -2);
    }
}
