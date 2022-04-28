package com.zww.leetcode.hot;

import java.util.Arrays;

/**
 * 560. 和为 K 的子数组 TODO 前缀和解法
 *
 * @author weiwei.zhao
 * @since 2022/04/28
 */
public class Solution560 {

    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution560().subarraySum(new int[]{1, -1, 0}, 0);
    }
}
