package com.zww.leetcode.offer;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 *
 * @author weiwei.zhao
 * @since 2022/05/31
 */
public class Solution021 {
    public int[] exchange(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0, j = 0, k = len - 1; i < len; i++) {
            if ((nums[i] & 1) == 1) {
                ans[j++] = nums[i];
            } else {
                ans[k--] = nums[i];
            }
        }
        return ans;
    }

    public int[] exchange2(int[] nums) {
        int len = nums.length;
        int i = 0, j = len - 1;
        while (i < j) {
            // i 奇数则执行 i++跳过
            while (i < j && (nums[i] & 1) == 1) i++;
            // j 偶数则执行 j-- 跳过
            while (i < j && (nums[j] & 1) == 0) j--;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }

}
