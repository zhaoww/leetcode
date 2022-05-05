package com.zww.leetcode.hot;

/**
 * 494. 目标和
 *
 * @author weiwei.zhao
 * @since 2022/05/05
 */
public class Solution494 {
    int ans = 0, sum = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0);
        return ans;
    }

    public void backtrack(int[] nums, int target, int index) {
        if (index == nums.length) {
            if (sum == target) ans++;
            return;
        }
        sum += nums[index];
        backtrack(nums, target, index + 1);
        sum -= 2 * nums[index];
        backtrack(nums, target, index + 1);
        sum += nums[index];
    }

    public static void main(String[] args) {
        new Solution494().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
    }
}
