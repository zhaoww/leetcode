package com.zww.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 剑指 Offer 38. 字符串的排列
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution038 {
    List<String> ansList = new ArrayList<>();

    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] used = new boolean[s.length()];
        Arrays.fill(used, false);
        Arrays.sort(chars);
        backtrack(chars, new StringBuilder(), used, s.length(), 0);
        int ansLen = ansList.size();
        String[] ans = new String[ansLen];
        for (int i = 0; i < ansLen; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

    public void backtrack(char[] s, StringBuilder cur, boolean[] used, int len, int index) {
        if (index == len) {
            ansList.add(cur.toString());
            return;
        }
        for (int i = 0; i < len; i++) {
            if (i > 0 && s[i - 1] == s[i] && !used[i - 1]) continue;
            if (!used[i]) {
                used[i] = true;
                cur.append(s[i]);
                backtrack(s, cur, used, len, index + 1);
                cur.deleteCharAt(cur.length() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new Solution038().permutation("abcc");
    }


}
