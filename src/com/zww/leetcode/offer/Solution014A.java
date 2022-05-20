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
        if (n < 4) return n - 1;
        int mod = n % 3;
        if (mod == 0) {
            return (int) Math.pow(3, n / 3);
        } else if (mod == 1) {
            return (int) Math.pow(3, n / 3 - 1) * 4;
        } else {
            return (int) Math.pow(3, n / 3) * 2;
        }
    }

    /**
     * 贪心
     *
     * @param n
     * @return
     */
    public int cuttingRope2(int n) {
        if (n < 4) return n - 1;
        int ans = 1;
        while (n > 4) {
            ans *= 3;
            n -= 3;
        }
        return ans * n;
    }

    /**
     * 动态规划
     *
     * @param n
     * @return
     */
    public int cuttingRope3(int n) {
        if (n < 4) return n - 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i < n + 1; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                max = Math.max(max, Math.max(j * dp[i - j], j * (i - j)));
            }
            dp[i] = max;
        }
        return dp[n];
    }


    public static void main(String[] args) {
        new Solution014A().cuttingRope(5);
    }
}
