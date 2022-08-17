package com.zww.leetcode.offer;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author weiwei.zhao
 * @since 2022/06/07
 */
public class Solution058B {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        new Solution058B().reverseLeftWords("abcdef", 2);
    }
}
