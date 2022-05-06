package com.zww.leetcode.other;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. 存在重复元素 II
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution0219 {
    /**
     * 暴力解法
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < i + k + 1 && j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    /**
     * 滑动窗口
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution0219().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
    }
}
