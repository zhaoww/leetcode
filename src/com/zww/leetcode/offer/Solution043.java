package com.zww.leetcode.offer;

/**
 * 剑指 Offer 43. 1～n 整数中 1 出现的次数
 *
 * @author weiwei.zhao
 * @since 2022/05/10
 */
public class Solution043 {

    public int countDigitOne(int n) {
        long mulk = 1;
        int ans = 0;
        while (n >= mulk) {
            // 每一位上面1的位数
            ans += (n / (mulk * 10)) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
            mulk *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution043().countDigitOne(22);
    }
}
