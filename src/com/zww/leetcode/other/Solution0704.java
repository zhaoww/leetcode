package com.zww.leetcode.other;

/**
 * 704. ¶ş·Ö²éÕÒ
 *
 * @author weiwei.zhao
 * @since 2022/07/01
 */
public class Solution0704 {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
