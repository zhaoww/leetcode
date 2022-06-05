package com.zww.leetcode.offer;

import java.util.Stack;

/**
 * 剑指 Offer 30. 包含min函数的栈
 *
 * @author 半山兄
 * @since 2022/06/03
 */
public class Solution030 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public Solution030() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        int val = minStack.peek();
        stack.push(x);

        if (val > x) {
            minStack.push(x);
        } else {
            minStack.push(val);
        }

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
