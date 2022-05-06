package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 1984. 学生分数的最小差值
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution1984 {
    public int minimumDifference(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - k + 1; i++) {
            ans = Math.min(nums[i + k - 1] - nums[i], ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution1984().minimumDifference(new int[]{9, 4, 1, 7}, 2);
    }
}
