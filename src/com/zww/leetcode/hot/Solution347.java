package com.zww.leetcode.hot;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 347. 前 K 个高频元素
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] karr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        queue.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            karr[i] = queue.poll().getKey();
        }
        return karr;
    }

    public static void main(String[] args) {
        new Solution347().topKFrequent(new int[]{1, 2, 2, 2, 3, 3}, 2);
    }
}
