package com.zww.leetcode.hot;

/**
 * 75. 颜色分类
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution075 {
    public void sortColors(int[] nums) {
        // 冒泡
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Solution075().sortColors(new int[]{0, 1, 2, 0, 2, 1});
    }
}
