package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 438. 找到字符串中所有字母异位词
 *
 * @author weiwei.zhao
 * @since 2022/05/05
 */
public class Solution438 {
    List<String> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    /**
     * 暴力回溯 【超时】
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        // 异位词
        backtrack(p, 0, new StringBuilder());

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String tmp = s.substring(i, i + p.length());
            for (int j = 0; j < list.size(); j++) {
                String sub = list.get(j);
                if (sub.equals(tmp)) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }

    public void backtrack(String p, int index, StringBuilder sub) {
        if (index == p.length()) {
            list.add(sub.toString());
            return;
        }
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (set.contains(i)) continue;
            sub.append(c);
            set.add(i);
            backtrack(p, index + 1, sub);
            sub.deleteCharAt(sub.length() - 1);
            set.remove(i);
        }
    }

    public List<Integer> findAnagrams(String s, String p) {
        return null;
    }

    public static void main(String[] args) {
        new Solution438().findAnagrams("baa", "aa");
    }
}
