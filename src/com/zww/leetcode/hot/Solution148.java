package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

import java.util.PriorityQueue;

/**
 * 148. 排序链表
 *
 * @author weiwei.zhao
 * @since 2022/04/25
 */
public class Solution148 {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((n1, n2) -> n2.val - n1.val);
        while (head != null) {
            priorityQueue.add(head);
            head = head.next;
        }

        ListNode pre = null;
        while (!priorityQueue.isEmpty()) {
            ListNode cur = priorityQueue.poll();
            cur.next = pre;
            pre = cur;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(5, listNode3);
        new Solution148().sortList(listNode4);
    }
}
