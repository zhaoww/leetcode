package com.zww.leetcode.other;

/**
 * 1876. 长度为三且各字符不同的子字符串
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution1876 {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2))
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution1876().countGoodSubstrings("xyzzaz");
    }
}
