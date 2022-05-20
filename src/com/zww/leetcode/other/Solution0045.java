package com.zww.leetcode.other;

/**
 * 45. 跳跃游戏 II
 *
 * @author weiwei.zhao
 * @since 2022/05/20
 */
public class Solution0045 {
    public int jump(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = 1;
        int ans = 0;
        while (end < len) {
            int maxPos = 0;
            for (int j = start; j < end; j++) {
                // 跳到的最远距离
                maxPos = Math.max(maxPos, j + nums[j]);
            }
            // 更新起跳位置
            start = end;
            end = maxPos + 1;
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        new Solution0045().jump(new int[]{2, 3, 1, 1, 4});
    }
}
