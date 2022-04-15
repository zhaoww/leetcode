package com.zww.leetcode;

import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author weiwei.zhao
 * @since 2022/04/15
 */
public class Solution020 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            } else if (c == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else if (c == ']') {
                if (stack.size() > 0 && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else if (c == '}') {
                if (stack.size() > 0 && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }
        return stack.empty();
    }

    public static void main(String[] args) {
        new Solution020().isValid("]");
    }
}
