package com.zww.leetcode.struct;

/**
 * Definition for singly-linked list.
 *
 * @author weiwei.zhao
 * @since 2022/04/14
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}