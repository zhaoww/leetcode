package com.zww.leetcode.common.struct;

/**
 * @author 半山兄
 * @since 2022/05/14
 */
public class Node2 {
    public int val;
    public Node2 left;
    public Node2 right;
    public Node2 next;

    public Node2(int _val) {
        val = _val;
    }

    public Node2(int _val, Node2 _left, Node2 _right, Node2 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
