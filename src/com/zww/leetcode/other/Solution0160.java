package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 160. 相交链表
 *
 * @author weiwei.zhao
 * @since 2022/06/24
 */
public class Solution0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }
}
