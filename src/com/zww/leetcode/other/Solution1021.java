package com.zww.leetcode.other;

import java.util.Stack;

/**
 * 1021. 删除最外层的括号
 *
 * @author 半山兄
 * @since 2022/05/28
 */
public class Solution1021 {
    public static void main(String[] args) {
        new Solution1021().removeOuterParentheses("(()())(())(()(()))");
    }

    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ')') {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans.append(c);
            }
            if (c == '(') {
                stack.push(c);
            }
        }
        return ans.toString();
    }
}
