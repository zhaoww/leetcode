package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 137. 只出现一次的数字 II
 *
 * @author 半山兄
 * @since 2022/07/11
 */
public class Solution0137 {
    public static void main(String[] args) {
        new Solution0137().singleNumber(new int[]{-2, -2, 1, 1, 4, 1, 4, 4, -4, -2});
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
