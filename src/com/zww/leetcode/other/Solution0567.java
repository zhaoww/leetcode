package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 567. 字符串的排列
 *
 * @author weiwei.zhao
 * @since 2022/05/07
 */
public class Solution0567 {

    public boolean checkInclusion(String s1, String s2) {
        int[] nums = new int[26];
        int[] curNums = new int[26];
        int len1 = s1.length(), len2 = s2.length();

        if (len1 > len2) return false;
        for (int i = 0; i < len1; i++) {
            nums[s1.charAt(i) - 'a']++;
            curNums[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(nums, curNums)) return true;
        for (int i = len1; i < len2; i++) {
            curNums[s2.charAt(i) - 'a']++;
            curNums[s2.charAt(i - len1) - 'a']--;
            if (Arrays.equals(nums, curNums)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution0567().checkInclusion("a", "ab");
    }
}
