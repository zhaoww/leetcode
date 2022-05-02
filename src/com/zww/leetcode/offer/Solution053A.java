package com.zww.leetcode.offer;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 *
 * @author 半山兄
 * @since 2022/05/02
 */
public class Solution053A {

    public int search(int[] nums, int target) {
        int ans = 0;
        if (nums.length == 0) return ans;
        // 二分查找出index
        int index = binarySearch(nums, target, 0, nums.length - 1);
        if (index == -1) return ans;

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] == target) ans++;
        }

        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] == target) ans++;
        }

        return ans + 1;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
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

    public static void main(String[] args) {
        new Solution053A().search(new int[]{1, 2, 2, 3, 4, 4, 5}, 2);
    }
}
