package com.zww.leetcode.other;

/**
 * 26. 删除有序数组中的重复项
 *
 * @author weiwei.zhao
 * @since 2022/06/24
 */
public class Solution0026 {
    public int removeDuplicates(int[] nums) {

        int fast = 0, slow = 0;
        int len = nums.length;
        while (fast < len) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }

            fast++;
        }
        return slow + 1;
    }
}
