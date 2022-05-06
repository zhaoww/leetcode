package com.zww.leetcode.other;

import java.util.TreeSet;

/**
 * 220. 存在重复元素 III
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution0220 {

    /**
     * 滑动窗口+ 有序treeset
     *
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];
            if (i > k) treeSet.remove((long) nums[i - k - 1]);
            Long left = treeSet.floor(num);
            Long right = treeSet.ceiling(num);
            if (left != null && num - left <= t) return true;
            if (right != null && right - num <= t) return true;
            treeSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution0220().containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 4, 3);
    }
}
