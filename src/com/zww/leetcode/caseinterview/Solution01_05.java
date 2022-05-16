package com.zww.leetcode.caseinterview;

/**
 * 01.05. 一次编辑
 *
 * @author weiwei.zhao
 * @since 2022/05/13
 */
public class Solution01_05 {
    public boolean oneEditAway(String first, String second) {
        int sub = Math.abs(first.length() - second.length());
        if (sub == 0) {
            if (first.equals(second)) return true;
            int cnt = 0;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    cnt++;
                    if (cnt == 2) return false;
                }
            }
        } else if (sub == 1) {
            if (first.length() == 0 || second.length() == 0) return true;
            if (first.length() < second.length()) {
                String tmp = first;
                first = second;
                second = tmp;
            }
            int cnt = 0;
            for (int i = 0, j = 0; i < first.length(); i++, j++) {
                if (first.charAt(i) != second.charAt(j)) {
                    cnt++;
                    j--;
                    if (cnt == 2) return false;
                }
                if (i == second.length() - 1 && cnt == 0) return true;
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution01_05().oneEditAway("a", "ab");
    }
}
