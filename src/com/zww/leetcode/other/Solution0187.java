package com.zww.leetcode.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 187. 重复的DNA序列
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution0187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String s1 = s.substring(i, i + 10);
            int cnt = map.getOrDefault(s1, 0);
            if (cnt == 1) ans.add(s1);
            map.put(s1, cnt + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
//        new Solution0187().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        new Solution0187().findRepeatedDnaSequences("AAAAAAAAAAAAA");

    }
}
