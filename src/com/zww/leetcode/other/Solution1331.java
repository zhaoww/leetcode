package com.zww.leetcode.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1331. 数组序号转换
 *
 * @author 半山兄
 * @since 2022/07/28
 */
public class Solution1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length, index = 0;
        for (int i : arr2) {
            if (!map.containsKey(i)) map.put(i, ++index);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
