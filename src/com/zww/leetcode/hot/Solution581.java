package com.zww.leetcode.hot;

/**
 * 581. 最短无序连续子数组
 *
 * @author weiwei.zhao
 * @since 2022/04/29
 */
public class Solution581 {
    /**
     * 右边小于max， 左边大于min 都是边界
     *
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int start = -1, end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                end = i;
            }
            max = Math.max(max, nums[i]);
        }

        if (end == -1) return 0;
        for (int i = end; i >= 0; i--) {
            if (nums[i] > min) {
                start = i;
            }
            min = Math.min(min, nums[i]);
        }

        return end - start + 1;
    }

    public static void main(String[] args) {
        new Solution581().findUnsortedSubarray(new int[]{2, 1});
    }
}
