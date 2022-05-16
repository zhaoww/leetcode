package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution052 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA !=nodeB){
            nodeA = nodeA == null? headB: nodeA.next;
            nodeB = nodeB == null? headA: nodeB.next;
        }
        return nodeA;
    }
}
