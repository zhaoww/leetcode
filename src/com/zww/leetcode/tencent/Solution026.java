package com.zww.leetcode.tencent;

/**
 * 26. 删除有序数组中的重复项
 *
 * @author weiwei.zhao
 * @since 2022/04/26
 */
public class Solution026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int same = 0;
        int tmp = nums[0];
        int max = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                same++;
                if (i > same) nums[same] = nums[i];
            }
            if (nums[i] == max) break;
        }
        return same + 1;
    }

    public static void main(String[] args) {
        new Solution026().removeDuplicates(new int[]{1, 1, 2, 2, 4});
    }
}
