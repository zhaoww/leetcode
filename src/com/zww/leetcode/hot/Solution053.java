package com.zww.leetcode.hot;

/**
 * 53. 最大子数组和
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution053 {

    /**
     * f(i)=max{f(i−1)+nums[i],nums[i]}
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            ans = Math.max(pre, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution053().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
}
