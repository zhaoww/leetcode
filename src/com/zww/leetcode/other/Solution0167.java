package com.zww.leetcode.other;

/**
 * 167. 两数之和 II - 输入有序数组
 *
 * @author weiwei.zhao
 * @since 2022/06/27
 */
public class Solution0167 {
    /**
     * 二分
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[]{-1, -1};
        for (int i = 0, len = numbers.length; i < len; i++) {
            int tar = target - numbers[i];
            int left = i + 1, right = len - 1, mid;
            while (left <= right) {
                mid = (left + right) / 2;
                if (numbers[mid] < tar) {
                    left = mid + 1;
                } else if (numbers[mid] > tar) {
                    right = mid - 1;
                } else {
                    return new int[]{i + 1, mid + 1};
                }
            }

        }
        return ans;
    }

    /**
     * 双指针
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum2(int[] numbers, int target) {
        int[] ans = new int[]{-1, -1};
        int len = numbers.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right - 1};
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        new Solution0167().twoSum(new int[]{0, 0, 3, 4}, 7);
    }
}
