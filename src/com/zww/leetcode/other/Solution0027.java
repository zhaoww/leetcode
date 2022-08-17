package com.zww.leetcode.other;

/**
 * 27. 移除元素
 *
 * @author weiwei.zhao
 * @since 2022/06/27
 */
public class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        new Solution0027().removeElement(new int[]{1, 2, 2, 3, 1, 4}, 2);
    }
}
