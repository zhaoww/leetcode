package com.zww.leetcode.hot;

/**
 * 55. 跳跃游戏
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution055 {
    /**
     * 贪心算法
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int target = nums.length - 1;
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > longest) return false;
            longest = Math.max(longest, i + nums[i]);
            if (longest >= target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution055().canJump(new int[]{1, 0, 1, 0});
    }
}
