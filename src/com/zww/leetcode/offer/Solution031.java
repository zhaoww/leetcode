package com.zww.leetcode.offer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 剑指 Offer 31. 栈的压入、弹出序列
 *
 * @author 半山兄
 * @since 2022/06/05
 */
public class Solution031 {
    public static void main(String[] args) {
        new Solution031().validateStackSequences(new int[]{2, 1, 0}, new int[]{1, 2, 0});
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0, len = pushed.length; i < len; i++) {
            deque.push(pushed[i]);
            while (!deque.isEmpty() && deque.peek() == popped[j]) {
                j++;
                deque.pop();
            }
        }

        return deque.isEmpty();
    }
}
