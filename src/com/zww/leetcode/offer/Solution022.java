package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.ListNode;

import java.util.Stack;

/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution022 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        for (int i = 1; !stack.empty(); i++) {
            if (i == k) return stack.pop();
            stack.pop();
        }
        return null;
    }

    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode listNode = new ListNode(0, head);
        int len = 0;
        while (head != null) {
            len ++;
            head = head.next;
        }

        for (int i = 0; i< len; i++) {
            listNode = listNode.next;
            if (i == len -k){
                return listNode;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        new Solution022().getKthFromEnd2(listNode4, 2);
    }
}
