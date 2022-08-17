package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 300. 最长递增子序列
 *
 * @author weiwei.zhao
 * @since 2022/07/22
 */
public class Solution0300 {

    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (ans < dp[i]) ans = dp[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        new Solution0300().lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3});
    }
}
