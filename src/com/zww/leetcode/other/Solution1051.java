package com.zww.leetcode.other;

import java.util.Arrays;

/**
 * 1051. 高度检查器
 *
 * @author weiwei.zhao
 * @since 2022/06/13
 */
public class Solution1051 {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] org = Arrays.copyOf(heights, len);
        Arrays.sort(heights);
        int ans = 0;
        for (int i = 0; i < len; i++) {
            if (org[i] != heights[i]) ans++;
        }
        return ans;
    }
}
