package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 142. 环形链表 II
 *
 * @author weiwei.zhao
 * @since 2022/06/24
 */
public class Solution0142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        // 如果不相遇 那就没有环
        if (fast == null || fast.next == null) return null;
        // 相遇点k-m步 即是相交点
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
