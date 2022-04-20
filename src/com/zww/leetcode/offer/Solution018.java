package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution018 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode cur = new ListNode(0, head);
        int i = 0;
        while (cur.next != null) {
            if (cur.next.val == val) {
                if (i == 0) return head.next;
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
            i++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        new Solution018().deleteNode(listNode4, 2);
    }
}
