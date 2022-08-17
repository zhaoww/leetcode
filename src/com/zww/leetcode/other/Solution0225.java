package com.zww.leetcode.other;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 *
 * @author weiwei.zhao
 * @since 2022/05/27
 */
public class Solution0225 {
    Queue<Integer> queue;
    Queue<Integer> queue2;

    public Solution0225() {
        queue = new ArrayDeque();
        queue2 = new ArrayDeque();
    }

    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        int val = 0;
        for (int i = 0, len = queue.size(); i < len; i++) {
            if (i == len - 1) {
                val = queue.poll();
            } else {
                queue2.offer(queue.poll());
            }
        }

        while (!queue2.isEmpty()) {
            queue.offer(queue2.poll());
        }
        return val;
    }

    public int top() {
        int val = 0;
        for (int i = 0, len = queue.size(); i < len; i++) {
            if (i == len - 1) {
                val = queue.peek();
            }
            queue2.offer(queue.poll());
        }

        while (!queue2.isEmpty()) {
            queue.offer(queue2.poll());
        }
        return val;
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Solution0225 myStack = new Solution0225();
        myStack.push(1);
        myStack.push(2);
        myStack.top(); // 返回 2
        myStack.pop(); // 返回 2
        myStack.empty(); // 返回 False
    }
}
