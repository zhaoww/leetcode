package com.zww.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 剑指 Offer 56 - II. 数组中数字出现的次数 II
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution056B {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0, len = nums.length; i < len; ) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) return nums[i];
                i += 3;
            } else if (i == len - 1) {
                if (nums[i] != nums[i - 1]) return nums[i];
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) return nums[i];
                i += 3;
            }
        }

        return -1;
    }
}
