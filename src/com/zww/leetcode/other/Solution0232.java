package com.zww.leetcode.other;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 *
 * @author weiwei.zhao
 * @since 2022/05/27
 */
public class Solution0232 {
    Stack<Integer> stack;
    Stack<Integer> stack2;

    public Solution0232() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack.empty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.empty()) {
            while (!stack.empty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack.empty() && stack2.empty();
    }
}
