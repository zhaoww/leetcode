package com.zww.leetcode.offer;

import java.util.PriorityQueue;

/**
 * 剑指 Offer 40. 最小的k个数
 *
 * @author weiwei.zhao
 * @since 2022/05/10
 */
public class Solution040 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            ans[i] = queue.poll();
        }
        return ans;
    }
}
