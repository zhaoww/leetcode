package com.zww.leetcode.hot;

/**
 * 5. 最长回文子串
 *
 * @author weiwei.zhao
 * @since 2022/04/14
 */
public class Solution005 {
    /**
     * 中心扩散
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        if (s.length() < 2) return s;
        for (int i = 0; i < s.length(); i++) {
            // 奇数
            int len1 = expandAroundCenter(s, i, i);
            // 偶数
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = len1 > len2 ? len1 : len2;
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * 中心扩散长度
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // right - left + 1 - 2
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution005().longestPalindrome("abacbcawbac"));
    }
}
