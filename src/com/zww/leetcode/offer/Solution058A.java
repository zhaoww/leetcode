package com.zww.leetcode.offer;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 *
 * @author weiwei.zhao
 * @since 2022/06/07
 */
public class Solution058A {
    public String reverseWords(String s) {
        s = s.trim();
        String[] split = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (!split[i].trim().equals("")) {
                ans.append(split[i]);
                if (i > 0) {
                    ans.append(" ");
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        new Solution058A().reverseWords("aa bb cc  ss.");
    }
}
