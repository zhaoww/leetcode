package com.zww.leetcode.hot;

/**
 * 31. 下一个排列
 *
 * @author weiwei.zhao
 * @since 2022/05/09
 */
public class Solution031 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        // 从后往前寻找第一个索引i < i+1的数
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) break;
        }

        if (i >= 0) {
            // 从后往前寻找第一个索引j > i的数
            int j = len - 1;
            for (; j >= 0; j--) {
                if (nums[j] > nums[i]) break;
            }
            // 交换
            swap(nums, i, j);
        }
        // 翻转
        reverse(nums, i + 1);

    }

    private void reverse(int[] nums, int l) {
        int r = nums.length - 1;
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
//        new Solution031().nextPermutation(new int[]{4, 5, 3, 6, 4, 2, 1});
        new Solution031().nextPermutation(new int[]{5, 4, 3});
    }
}
