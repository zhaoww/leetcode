package com.zww.leetcode.other;

import java.util.HashMap;
import java.util.Map;

/**
 * 953. 验证外星语词典
 *
 * @author weiwei.zhao
 * @since 2022/05/17
 */
public class Solution0953 {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length <= 1) return true;
        Map<Character, Integer> sortMap = new HashMap<>();
        char[] orderChars = order.toCharArray();
        for (int i = 0; i < orderChars.length; i++) {
            sortMap.put(orderChars[i], i);
        }

        int len = words.length;
        for (int i = 0; i < len - 1; i++) {
            char[] s1 = words[i].toCharArray();
            char[] s2 = words[i + 1].toCharArray();
            int s1Len = s1.length, s2Len = s2.length;
            int jlen = Math.min(s1Len, s2Len);
            for (int j = 0; j < jlen; j++) {
                int v1 = sortMap.get(s1[j]);
                int v2 = sortMap.get(s2[j]);
                if (v1 > v2) {
                    return false;
                } else if (v1 < v2) {
                    break;
                } else {
                    if (j == jlen - 1 && s1Len > s2Len) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution0953().isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
    }

}
