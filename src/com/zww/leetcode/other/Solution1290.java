package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.ListNode;

/**
 * 1290. 二进制链表转整数
 *
 * @author weiwei.zhao
 * @since 2022/05/11
 */
public class Solution1290 {

    /**
     * 5÷2=2余1
     * 2÷2=1余0
     * 1÷2=0余1
     * ===> 得出二进制 101 .
     * 反推回去 商 x 除数 + 余数
     * => 0 x 2 + 1 = 1
     * -> 1 x 2 + 0 = 2
     * -> 2 x 2 +1 = 5
     *
     * @param head
     * @return
     */
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        ListNode cur = head;
        while (cur != null) {
            ans = (ans << 1) + cur.val;
            cur = cur.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(1, null);
        ListNode listNode3 = new ListNode(0, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);
        new Solution1290().getDecimalValue(listNode4);
    }
}
