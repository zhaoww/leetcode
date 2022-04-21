package com.zww.leetcode.hot;

/**
 * 283. 移动零
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        int n = nums.length - j;
        for (int i = nums.length - 1; n > 0; i--, n--) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        new Solution283().moveZeroes(new int[]{1, 2, 0, 3, 0, 4});
    }
}
