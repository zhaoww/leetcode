package com.zww.leetcode.other;

/**
 * 344. 反转字符串
 *
 * @author weiwei.zhao
 * @since 2022/06/27
 */
public class Solution0344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[right];
            s[right--] = s[left];
            s[left++] = tmp;
        }
    }
}
