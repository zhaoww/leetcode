package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author weiwei.zhao
 * @since 2022/06/23
 */
public class Solution0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode p = ans;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                p.next = list2;
                list2 = list2.next;
            } else {
                p.next = list1;
                list1 = list1.next;
            }
            p = p.next;
        }

        p.next = list1 == null ? list2 : list1;
        return ans.next;
    }

    public static void main(String[] args) {
        ListNode list3 = new ListNode(3);
        ListNode list1 = new ListNode(1, list3);


        ListNode list2 = new ListNode(2);
        new Solution0021().mergeTwoLists(list1, list2);
    }
}
