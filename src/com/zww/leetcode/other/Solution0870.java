package com.zww.leetcode.other;

import java.util.*;

/**
 * 870. 优势洗牌
 *
 * @author weiwei.zhao
 * @since 2022/07/04
 */
public class Solution0870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        Arrays.sort(nums1);
        int[] tmp = Arrays.copyOf(nums2, len);
        Arrays.sort(nums2);
        Map<Integer, List<Integer>> map = new HashMap<>();
        // 对比
        int start = 0, end = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            // 用最小的
            List<Integer> list = map.getOrDefault(nums2[i], new ArrayList<>());
            if (nums1[end] <= nums2[i]) {
                list.add(nums1[start]);
                map.put(nums2[i], list);
                start++;
            } else {
                list.add(nums1[end]);
                map.put(nums2[i], list);
                end--;
            }
        }

        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            List<Integer> list = map.get(tmp[i]);
            ans[i] = list.remove(0);
        }

        return ans;
    }

    public static void main(String[] args) {
        new Solution0870().advantageCount(new int[]{2,0,4,1,2}, new int[]{1,3,0,0,2});
    }
}
