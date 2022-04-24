package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution022 {
    public static List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(StringBuilder cur, int left, int right, int max) {

        if (cur.length() == 2 * max) {
            ans.add(cur.toString());
            return;
        }

        if (left < max) {
            cur.append("(");
            backtrack(cur, left + 1, right, max);
            cur.deleteCharAt(cur.length() - 1);
        }

        if (right < left) {
            cur.append(')');
            backtrack(cur, left, right + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }

    }

    public static void main(String[] args) {
        new Solution022().generateParenthesis(1);
    }
}
