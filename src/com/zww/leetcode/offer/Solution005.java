package com.zww.leetcode.offer;

/**
 * 剑指 Offer 05. 替换空格
 *
 * @author weiwei.zhao
 * @since 2022/04/18
 */
public class Solution005 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new Solution005().replaceSpace("xx ss sq");
    }
}
