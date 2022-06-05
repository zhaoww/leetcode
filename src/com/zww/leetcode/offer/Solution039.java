package com.zww.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 39. 数组中出现次数超过一半的数字
 *
 * @author 半山兄
 * @since 2022/06/05
 */
public class Solution039 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length / 2 + (nums.length % 2 == 0 ? 0 : 1);
        for (int num : nums) {
            int cnt = map.getOrDefault(num, 0);
            if (++cnt >= len) return num;
            map.put(num, cnt);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= len) return entry.getKey();
        }
        return -1;
    }
}
