package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 206. 反转链表
 *
 * @author weiwei.zhao
 * @since 2022/06/24
 */
public class Solution0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);
        new Solution0206().reverseList(node);
    }
}
