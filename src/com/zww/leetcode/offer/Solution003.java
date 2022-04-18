package com.zww.leetcode.offer;

import java.util.HashSet;

/**
 * 剑指 Offer 03. 数组中重复的数字
 *
 * @author weiwei.zhao
 * @since 2022/04/18
 */
public class Solution003 {

    public int findRepeatNumber(int[] nums) {
        HashSet set = new HashSet();
        for (int num : nums) {
            if (!set.add(num)) return num;
        }
        return -1;
    }

    public static void main(String[] args) {

        new Solution003().findRepeatNumber(new int[]{1, 2, 3, 2, 4, 5});
    }
}
