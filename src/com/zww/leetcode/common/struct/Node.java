package com.zww.leetcode.common.struct;

/**
 * @author 半山兄
 * @since 2022/05/14
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
