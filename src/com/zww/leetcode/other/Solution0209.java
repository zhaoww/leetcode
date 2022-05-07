package com.zww.leetcode.other;

/**
 * 209. 长度最小的子数组
 *
 * @author weiwei.zhao
 * @since 2022/05/07
 */
public class Solution0209 {
    /**
     * 滑动窗口
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0, end = 0;

        while (end < nums.length) {
            sum += nums[end];
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        new Solution0209().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
    }
}
