package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 剑指 Offer 25. 合并两个排序的链表
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution025 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode p = ans;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return ans.next;
    }
}
