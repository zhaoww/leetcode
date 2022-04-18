package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 2. 两数相加
 *
 * @author weiwei.zhao
 * @since 2022/04/14
 */
public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resNode = new ListNode();
        ListNode curNode = resNode;
        // 进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            int p = 0;
            p += l1 == null ? 0 : l1.val;
            p += l2 == null ? 0 : l2.val;
            // 加上进位
            p += carry;
            // 进位
            if (p > 9) {
                carry = 1;
                p = p % 10;
            } else {
                carry = 0;
            }

            curNode.next = new ListNode(p);
            curNode = curNode.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            if (l1 == null && l2 == null && carry > 0){
                curNode.next = new ListNode(carry);
                curNode = curNode.next;
            }
        }

        return resNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(5, listNode3);

        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(4, listNode5);
        ListNode listNode7 = new ListNode(5, listNode6);
        ListNode listNode8 = new ListNode(5, listNode7);

        new Solution002().addTwoNumbers(listNode2, listNode7);
    }
}
