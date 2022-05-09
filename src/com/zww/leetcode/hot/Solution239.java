package com.zww.leetcode.hot;

import java.util.Map;
import java.util.TreeMap;

/**
 * 239. 滑动窗口最大值
 *
 * @author weiwei.zhao
 * @since 2022/05/07
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int cnt = treeMap.getOrDefault(nums[i], 0);
            treeMap.put(nums[i], cnt + 1);
            if (i >= k - 1) {
                Map.Entry<Integer, Integer> lastEntry = treeMap.lastEntry();
                ans[index++] = lastEntry.getKey();

                int preKey = nums[i - k + 1];
                int preCnt = treeMap.get(preKey);
                if (preCnt > 1) {
                    treeMap.put(preKey, preCnt - 1);
                } else {
                    treeMap.remove(preKey);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        new Solution239().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
    }
}
