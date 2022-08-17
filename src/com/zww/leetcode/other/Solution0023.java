package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. 合并K个升序链表
 *
 * @author weiwei.zhao
 * @since 2022/06/23
 */
public class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode ans = new ListNode();
        ListNode p = ans;
        int len = lists.length;
        int index = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                if (lists[i] != null) {
                    if (min > lists[i].val) {
                        min = lists[i].val;
                        index = i;
                    }
                }
            }

            p.next = lists[index];
            p = p.next;
            if (lists[index] != null) {
                lists[index] = lists[index].next;
            }
            int j = 0;
            for (; j < len; j++) {
                if (lists[j] != null) break;
            }
            if (j == len) break;
        }
        return ans.next;
    }

    /**
     * 优先队列
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode ans = new ListNode();
        ListNode p = ans;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        for (ListNode list : lists) {
            if (list != null) queue.offer(list);
        }
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = node;
            if (node.next != null) queue.offer(node.next);
            p = p.next;
        }
        return ans.next;
    }
}
