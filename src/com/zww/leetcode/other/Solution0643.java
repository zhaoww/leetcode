package com.zww.leetcode.other;

/**
 * 643. 子数组最大平均数 I
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution0643 {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        int preSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            int curSum = preSum + nums[i] - nums[i - k];
            // 缓存前一轮的sum值
            preSum = curSum;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum / (k * 1d);
    }


    public static void main(String[] args) {
        new Solution0643().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
    }
}
