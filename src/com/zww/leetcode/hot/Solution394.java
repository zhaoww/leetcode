package com.zww.leetcode.hot;

import java.util.Stack;

/**
 * 394. 字符串解码
 *
 * @author weiwei.zhao
 * @since 2022/04/28
 */
public class Solution394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<StringBuilder> charStack = new Stack<>();
        Stack<Integer> cntStack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                charStack.push(ans);
                cntStack.push(cnt);

                cnt = 0;
                ans = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = charStack.pop();
                int num = cntStack.pop();
                for (int j = 0; j < num; j++) {
                    tmp.append(ans);
                }
                ans = tmp;
            } else if (Character.isDigit(c)) {
                cnt = cnt * 10 + (c - '0');
                stack.push(c);
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        new Solution394().decodeString("e2[ab]3[cd]ef");
    }
}
