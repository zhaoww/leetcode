package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 *
 * @author weiwei.zhao
 * @since 2022/05/12
 */
public class Solution0082 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        // 标记前一个是否是重复节点
        boolean isDuplicate = false;
        while (cur.next != null) {
            ListNode next = cur.next.next;
            if (next != null && cur.next.val == next.val) {
                cur.next = next;
                isDuplicate = true;
            } else {
                // 如果是重复节点 同样删除掉
                if (isDuplicate) {
                    cur.next = next;
                } else {
                    cur = cur.next;
                }
                isDuplicate = false;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(2, listNode3);
        ListNode listNode5 = new ListNode(2, listNode4);
        new Solution0082().deleteDuplicates(listNode5);
    }
}
