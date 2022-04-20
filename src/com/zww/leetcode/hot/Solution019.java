package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

import java.util.Stack;

/**
 * 19. 删除链表的倒数第 N 个结点
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution019 {

    /**
     * 通过栈 入栈后弹出 头插生成链表
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode newLd = null;
        for (int i = 1; !stack.empty(); i++) {
            ListNode ld = stack.pop();
            if (i != n) {
                ld.next = newLd;
                newLd = ld;
            }
        }
        return newLd;
    }

    /**
     * 获取长度，后改变next指向
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }

        ListNode cur = dummy;
        for (int i = 0; i < len - n ; i++) {
           cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution019().removeNthFromEnd2(listNode4, 2);
    }
}
