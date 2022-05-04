package com.zww.leetcode.offer;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 *
 * @author 半山兄
 * @since 2022/05/04
 */
public class Solution053B {

    public int missingNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        new Solution053B().missingNumber(new int[]{0, 1, 2, 4, 5, 6, 7, 8, 9, 10});
    }
}
