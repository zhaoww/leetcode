package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 876. 链表的中间结点
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution0876 {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }
        return list.get(list.size() / 2);
    }

    public ListNode middleNode2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution0876().middleNode(listNode4);
    }

}
