package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 61. 旋转链表
 *
 * @author weiwei.zhao
 * @since 2022/05/12
 */
public class Solution0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int len = getLen(head);
        k = k % len;
        if (k == 0) return head;
        ListNode cur = head;
        // 根据k切割左右， 右边节点末端指向头结点
        ListNode right = new ListNode();
        ListNode p = right;
        for (int i = 1; i <= len; i++) {
            if (i == len - k) {
                right = cur.next;
                p = right;
                cur.next = null;
            } else if (i > len - k) {
                if (i == len) {
                    p.next = head;
                } else {
                    p = p.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return right;
    }

    public int getLen(ListNode node) {
        int cnt = 0;
        ListNode cur = node;
        while (cur != null) {
            cur = cur.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        ListNode listNode5 = new ListNode(2, listNode4);
        new Solution0061().rotateRight(listNode1, 1);
    }
}
