package com.zww.leetcode.other;

/**
 * 91. 解码方法
 *
 * @author 半山兄
 * @since 2022/05/21
 */
public class Solution0091 {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            if (chars[i - 1] != '0') {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && chars[i - 2] != '0' && ((chars[i - 2] - '0') * 10 + (chars[i - 1] - '0') <= 26)) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        new Solution0091().numDecodings("226");
    }
}
