package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

import java.util.Stack;

/**
 * 206. 反转链表
 *
 * @author weiwei.zhao
 * @since 2022/04/19
 */
public class Solution206 {

    /**
     * 通过栈来翻转
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode reverse = new ListNode();
        ListNode cur = reverse;
        while (!stack.empty()) {
            cur.next = stack.pop();
            cur = cur.next;
        }
        cur.next = null;
        return reverse.next;
    }

    /**
     * 迭代
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution206().reverseList2(listNode4);
    }
}
