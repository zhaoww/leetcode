package com.zww.leetcode.hot;

/**
 * 198. 打家劫舍
 *
 * @author weiwei.zhao
 * @since 2022/04/25
 */
public class Solution198 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int s1 = nums[0], s2 = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = s2;
            s2 = Math.max(s1 + nums[i], s2);
            s1 = temp;
        }
        return s2;
    }

    public static void main(String[] args) {
        new Solution198().rob(new int[]{6,3,10,8,2,10,3,5,10,5,3});
    }
}
