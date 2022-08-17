package com.zww.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer 59 - II. 队列的最大值
 *
 * @author 半山兄
 * @since 2022/06/16
 */
public class Solution059B {
    Deque<Integer> queue;
    Deque<Integer> max;

    public Solution059B() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    public static void main(String[] args) {
        int val = 0;
        Solution059B solution059B = new Solution059B();
        solution059B.push_back(1);
        solution059B.push_back(2);
        val = solution059B.max_value();
        solution059B.pop_front();
        val = solution059B.max_value();
        System.out.println(val);
    }

    public int max_value() {
        if (queue.isEmpty()) return -1;
        return max.peekFirst();
    }

    public void push_back(int value) {
        queue.offerLast(value);
        while (!max.isEmpty() && max.peekLast() < value) {
            max.pollLast();
        }
        max.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        if (max.peekFirst().equals(queue.peekFirst())) {
            max.pollFirst();
        }
        return queue.pollFirst();
    }
}
