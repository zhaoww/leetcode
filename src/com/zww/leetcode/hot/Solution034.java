package com.zww.leetcode.hot;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution034 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);
        return res;
    }

    public int binarySearch(int[] nums, int target, boolean left) {
        int start = 0, end = nums.length - 1, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if ((left && (mid == 0 || nums[mid - 1] < target)
                    || (!left && (mid == nums.length - 1 || nums[mid + 1] > target)))
                    && nums[mid] == target) {
                return mid;
            } else {
                if (left) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        new Solution034().searchRange(new int[]{1, 2, 2, 4, 4, 4, 5, 5, 6, 6, 7}, 7);
    }
}
