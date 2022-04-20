package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 141. 环形链表
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution141 {
    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution141().hasCycle(listNode4);
    }
}
