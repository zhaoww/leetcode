package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.ListNode;

import java.util.LinkedList;

/**
 * 234. 回文链表
 *
 * @author weiwei.zhao
 * @since 2022/04/19
 */
public class Solution234 {
    /**
     * 借助linkedList
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        while (!list.isEmpty()) {
            if (list.size() == 1) break;
            if (list.removeFirst().intValue() != list.removeLast().intValue()) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution234().isPalindrome(listNode4);
    }
}
