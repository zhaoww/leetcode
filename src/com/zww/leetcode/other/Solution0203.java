package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 203. 移除链表元素
 *
 * @author weiwei.zhao
 * @since 2022/05/10
 */
public class Solution0203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(2, listNode3);
        new Solution0203().removeElements(listNode4, 2);
    }
}
