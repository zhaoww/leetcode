package com.zww.leetcode.other;

/**
 * 303. 区域和检索 - 数组不可变
 *
 * @author weiwei.zhao
 * @since 2022/06/28
 */
public class Solution0303 {
    int[] preSums;

    public Solution0303(int[] nums) {
        int len = nums.length;
        preSums = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            preSums[i] = preSums[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return preSums[right + 1] - preSums[left];
    }

    public static void main(String[] args) {
        Solution0303 solution0303 = new Solution0303(new int[]{-2, 0, 3, -5, 2, -1});
        solution0303.sumRange(2, 5);
    }
}
