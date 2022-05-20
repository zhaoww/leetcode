package com.zww.leetcode.offer;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 *
 * @author weiwei.zhao
 * @since 2022/05/17
 */
public class Solution042 {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ans = Math.max(dp[i], ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution042().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
