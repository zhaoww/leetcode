package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 128. 最长连续序列
 *
 * @author 半山兄
 * @since 2022/07/10
 */
public class Solution0128 {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        int pre = Integer.MAX_VALUE;
        int cnt = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == pre) {
                cnt++;
            } else if (nums[i] == pre) {
                continue;
            } else {
                cnt = 1;
            }
            pre = nums[i];
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
