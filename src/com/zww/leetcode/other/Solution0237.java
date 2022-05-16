package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 237. 删除链表中的节点
 *
 * @author weiwei.zhao
 * @since 2022/05/10
 */
public class Solution0237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        new Solution0237().deleteNode(listNode4);
    }
}
