package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 416. 分割等和子集
 *
 * @author weiwei.zhao
 * @since 2022/08/09
 */
public class Solution0416 {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        sum = sum / 2;
        int len = nums.length;
        boolean[][] dp = new boolean[len + 1][sum + 1];
        for (int i = 0; i <= len; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j - nums[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[len][sum];
    }
}
