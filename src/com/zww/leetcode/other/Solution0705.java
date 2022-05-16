package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 705. 设计哈希集合
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution0705 {
    public ListNode listNode;

    public Solution0705() {

    }

    public void add(int key) {
        if (contains(key)) return;
        ListNode node = new ListNode(key);
        node.next = listNode;
        listNode = node;
    }

    public void remove(int key) {
        ListNode dummy = new ListNode();
        dummy.next = listNode;
        ListNode p = dummy;
        while (p.next != null) {
            if (p.next.val == key) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        listNode = dummy.next;
    }

    public boolean contains(int key) {
        ListNode cur = listNode;
        while (cur != null) {
            if (cur.val == key) return true;
            cur = cur.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution0705 solution0705 = new Solution0705();
        solution0705.add(1);
        solution0705.add(2);
        solution0705.contains(1);
        solution0705.contains(3);
        solution0705.add(2);
        solution0705.contains(2);
        solution0705.remove(2);
        solution0705.contains(2);
    }
}
