package com.zww.leetcode.hot;

/**
 * 11. 盛最多水的容器
 *
 * @author weiwei.zhao
 * @since 2022/04/22
 */
public class Solution011 {
    public int maxArea(int[] height) {
        int ans = 0;
        int start = 0, end = height.length - 1;
        while (start < end) {
            int tmpArea = (end - start) * Math.min(height[start], height[end]);
            ans = Math.max(ans, tmpArea);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution011().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }
}
