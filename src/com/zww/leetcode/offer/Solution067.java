package com.zww.leetcode.offer;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 *
 * @author weiwei.zhao
 * @since 2022/06/21
 */
public class Solution067 {
    public int strToInt(String str) {
        char[] chars = str.toCharArray();
        boolean flag = true;
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = chars.length; i < len; i++) {
            if (first) {
                if (chars[i] == ' ') {
                    continue;
                } else if (chars[i] == '+') {
                    first = false;
                    continue;
                } else if (chars[i] == '-') {
                    flag = false;
                    first = false;
                    continue;
                } else if (chars[i] >= '0' && chars[i] <= '9') {
                    first = false;
                    sb.append(chars[i] - '0');
                } else {
                    return 0;
                }
            } else {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    sb.append(chars[i] - '0');
                } else {
                    break;
                }
            }
        }

        if (sb.length() == 0) return 0;
        Integer l;
        try {
            sb = flag ? sb : sb.insert(0, '-');
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        new Solution067().strToInt("words and 987");
    }
}
