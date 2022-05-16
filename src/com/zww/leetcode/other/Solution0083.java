package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 *
 * @author weiwei.zhao
 * @since 2022/05/10
 */
public class Solution0083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null) {
            if (p.next != null && p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(2, listNode3);
        new Solution0083().deleteDuplicates(listNode4);
    }
}
