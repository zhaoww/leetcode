package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 24. 两两交换链表中的节点
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1, head);
        ListNode p = dummy;
        while (p.next != null && p.next.next != null) {
            ListNode tmp1 = p.next;
            ListNode tmp2 = p.next.next;
            p.next = tmp2;
            tmp1.next = tmp2.next;
            tmp2.next = tmp1;

            p = p.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution0024().swapPairs(listNode4);
    }
}
