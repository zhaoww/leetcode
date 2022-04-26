package com.zww.leetcode.hot;

/**
 * 152. 乘积最大子数组
 *
 * @author weiwei.zhao
 * @since 2022/04/25
 */
public class Solution152 {

    /**
     * 暴力解法
     *
     * @param nums
     * @return
     */
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int cur = 1;
            for (int j = i; j < nums.length; j++) {
                cur = cur * nums[j];
                max = Math.max(cur, max);
            }
        }
        return max;
    }

    /**
     * 动态规划
     * 当负数出现时则imax与imin进行交换再进行下一步计算
     * imax = max(imax * nums[i], nums[i])
     * imin = min(imin * nums[i], nums[i])
     *
     * @param nums
     * @return
     */
    public int maxProduct2(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            max = Math.max(imax, max);
        }
        return max;
    }

    public static void main(String[] args) {
        new Solution152().maxProduct(new int[]{2, -2, -3, -4});
    }
}
