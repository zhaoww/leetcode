package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author weiwei.zhao
 * @since 2022/04/18
 */
public class Solution021 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            cur.next = list2;
        }
        if (list2 == null) {
            cur.next = list1;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);

        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(6, listNode5);
        ListNode listNode7 = new ListNode(4, listNode6);
        ListNode listNode8 = new ListNode(3, listNode7);

        new Solution021().mergeTwoLists(listNode4, listNode8);
    }
}
