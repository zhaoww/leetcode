package com.zww.leetcode.offer;

/**
 * 剑指 Offer 14- I. 剪绳子
 *
 * @author weiwei.zhao
 * @since 2022/05/16
 */
public class Solution014A {

    /**
     * https://leetcode.cn/problems/jian-sheng-zi-lcof/solution/mian-shi-ti-14-i-jian-sheng-zi-tan-xin-si-xiang-by/
     * 拆分尽可能多的3
     *
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int y = n % 3;
        if (y == 0) {
            return (int) Math.pow(3, n / 3);
        } else if (y == 1) {
            return (int) Math.pow(3, n / 3 - 1) * 4;
        } else {
            return (int) Math.pow(3, n / 3 ) * 2;
        }
    }

    public static void main(String[] args) {
        new Solution014A().cuttingRope(5);
    }
}
