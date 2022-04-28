package com.zww.leetcode.hot;

import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素
 *
 * @author weiwei.zhao
 * @since 2022/04/25
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((n1, n2) -> n2.intValue() - n1.intValue());
        for (int num : nums) {
            priorityQueue.add(num);
        }
        for (int i = 0; i < k; i++) {
            int ans = priorityQueue.poll();
            if (i == k - 1) {
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new Solution215().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
    }
}
