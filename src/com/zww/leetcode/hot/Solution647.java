package com.zww.leetcode.hot;

/**
 * 647. 回文子串
 *
 * @author weiwei.zhao
 * @since 2022/04/29
 */
public class Solution647 {

    public int ans = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            // 奇数
            expandAroundCenter(s, i, i);
            // 偶数
            expandAroundCenter(s, i, i + 1);
        }
        return ans;
    }

    public void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            if (left != right) ans++;
        }
    }

    public static void main(String[] args) {
        new Solution647().countSubstrings("abc");
    }
}
