package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 *
 * @author weiwei.zhao
 * @since 2022/04/18
 */
public class Solution006 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[size - 1 - i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution006().reversePrint(listNode4);
    }
}
