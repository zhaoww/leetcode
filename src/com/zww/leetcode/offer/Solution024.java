package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 剑指 Offer 24. 反转链表
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution024 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
