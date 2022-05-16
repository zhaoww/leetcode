package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 92. 反转链表 II
 *
 * @author weiwei.zhao
 * @since 2022/05/12
 */
public class Solution0092 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur = head;
        ListNode leftDummy = new ListNode();
        ListNode leftCur = leftDummy;
        ListNode rightCur = null;
        ListNode waitReverseDummy = new ListNode();
        ListNode waitReverseCur = waitReverseDummy;
        // 拆分 左中右 中间部分待反转 再拼接起来
        for (int i = 1; cur != null; i++) {
            if (i < left) {
                leftCur.next = new ListNode(cur.val);
                leftCur = leftCur.next;
            } else if (i > right) {
                rightCur = cur;
                break;
            } else {
                waitReverseCur.next = new ListNode(cur.val);
                waitReverseCur = waitReverseCur.next;
            }
            cur = cur.next;
        }

        ListNode reverseDummy = reverse(waitReverseDummy.next);
        ListNode reverseCur = reverseDummy;

        for (int i = 0; i <= right - left; i++) {
            if (i == right - left) {
                reverseCur.next = rightCur;
            } else {
                reverseCur = reverseCur.next;
            }
        }

        leftCur.next = reverseDummy;
        return leftDummy.next;
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode cur = node;
        while (cur != null) {
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
        ListNode listNode3 = new ListNode(5, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);
        ListNode listNode5 = new ListNode(3, listNode4);
        ListNode listNode6 = new ListNode(2, listNode5);
        ListNode listNode7 = new ListNode(1, listNode6);
        new Solution0092().reverseBetween(listNode7, 2, 5);
    }
}
