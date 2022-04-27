package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

import java.util.HashSet;

/**
 * 160. 相交链表
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        while (headA != null) {
            nodeSet.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (nodeSet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
