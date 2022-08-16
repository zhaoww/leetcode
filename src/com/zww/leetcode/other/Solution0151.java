package com.zww.leetcode.other;

/**
 * 151. 颠倒字符串中的单词
 *
 * @author 半山兄
 * @since 2022/07/12
 */
public class Solution0151 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        String[] sarr = s.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            if (!"".equals(sarr[i])) {
                ans.append(sarr[i]);
                if (i != 0) ans.append(" ");
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        new Solution0151().reverseWords("a ss sxx  aa");
    }
}
