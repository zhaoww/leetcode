package com.zww.leetcode.hot;

import java.util.HashSet;

/**
 * 3. 无重复字符的最长子串
 *
 * @author weiwei.zhao
 * @since 2022/04/14
 */
public class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        byte[] bytes = s.getBytes();
        int count = 0;
        int max = 0;
        HashSet<Byte> tmpSet = new HashSet<>();
        for (int i = 0, len = bytes.length; i < len; i++) {
            for (int j = i; j < len; j++) {
                byte b = bytes[j];
                if (tmpSet.contains(b)) {
                    max = max > count ? max : count;
                    count = 0;
                    tmpSet.clear();
                    break;
                }
                tmpSet.add(b);
                count++;
                if (j == len - 1) {
                    max = max > count ? max : count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new Solution003().lengthOfLongestSubstring(" ");
    }
}
