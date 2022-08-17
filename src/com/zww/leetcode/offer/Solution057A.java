package com.zww.leetcode.offer;

import java.util.HashSet;

/**
 * 剑指 Offer 57. 和为s的两个数字
 *
 * @author weiwei.zhao
 * @since 2022/06/07
 */
public class Solution057A {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] > target) break;
            int updateTarget = target - nums[i];
            int index = binarySearch(nums, updateTarget, 0, len - 1);
            if (index != -1) {
                ans[0] = nums[i];
                ans[1] = updateTarget;
            }
        }
        return ans;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0, len = nums.length; i < len; i++) {
            if (nums[i] > target) break;
            int updateTarget = target - nums[i];
            if (set.contains(updateTarget)) {
                ans[0] = nums[i];
                ans[1] = updateTarget;
                return ans;
            } else {
                set.add(nums[i]);
            }
        }
        return ans;
    }

    public int[] twoSum3(int[] nums, int target) {
        int[] ans = new int[2];
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                ans[0] = nums[start];
                ans[1] = nums[end];
                return ans;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return ans;
    }
}
