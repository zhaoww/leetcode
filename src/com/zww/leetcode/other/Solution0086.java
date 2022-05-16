package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 86. 分隔链表
 *
 * @author weiwei.zhao
 * @since 2022/05/12
 */
public class Solution0086 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;
        ListNode leftDummy = new ListNode();
        ListNode leftCur = leftDummy;
        ListNode rightDummy = new ListNode();
        ListNode rightCur = rightDummy;
        ListNode cur = head;

        // 切割成<x 和 >=x两个链表 再整合
        while (cur != null) {
            ListNode tmp = new ListNode(cur.val);
            if (cur.val < x) {
                leftCur.next = tmp;
                leftCur = leftCur.next;
            } else {
                rightCur.next = tmp;
                rightCur = rightCur.next;
            }
            cur = cur.next;
        }
        leftCur.next = rightDummy.next;

        return leftDummy.next;
    }

    public static void main(String[] args) {
//        1,4,3,2,5,2
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(3, listNode3);
        ListNode listNode5 = new ListNode(4, listNode4);
        ListNode listNode6 = new ListNode(1, listNode5);
        new Solution0086().partition(listNode6, 3);
    }
}
