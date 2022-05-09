package com.zww.leetcode.hot;

/**
 * 33. 搜索旋转排序数组
 *
 * @author weiwei.zhao
 * @since 2022/05/09
 */
public class Solution033 {
    public int search(int[] nums, int target) {
        int len = nums.length, start = 0, end = len -1, mid;
        while (start <= end) {
            mid = (start + end) >> 1;
            int midValue = nums[mid];
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= midValue) {
                if (nums[0] <= target && target < midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[len - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new Solution033().search(new int[]{14, 15, 16, 17, 0, 1, 2, 4, 5, 7, 8, 9, 10}, 0);
    }
}
