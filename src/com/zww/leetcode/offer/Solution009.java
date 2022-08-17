package com.zww.leetcode.offer;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 *
 * @author weiwei.zhao
 * @since 2022/05/30
 */
public class Solution009 {
    Stack<Integer> stack;
    Stack<Integer> stack2;

    public Solution009() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        int value = -1;
        if (stack.empty() && stack2.empty()) return value;
        if (!stack2.empty()) return stack2.pop();
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            value = stack.pop();
            if (i < len - 1) {
                stack2.push(value);
            }
        }
        return value;
    }
}
