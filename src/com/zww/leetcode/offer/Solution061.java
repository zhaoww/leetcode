package com.zww.leetcode.offer;

import java.util.Arrays;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution061 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int pre = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
            } else {
                if (pre != -1) {
                    if (pre != nums[i] - 1) {
                        int c = nums[i] - 1 - pre;
                        if (c > cnt || c < 0) return false;
                        cnt -= c;
                    }
                }
                pre = nums[i];
            }

        }
        return true;
    }

    public static void main(String[] args) {
        new Solution061().isStraight(new int[]{0, 0, 2, 2, 5});
    }
}
