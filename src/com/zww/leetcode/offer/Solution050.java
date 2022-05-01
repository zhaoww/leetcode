package com.zww.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 *
 * @author 半山兄
 * @since 2022/05/01
 */
public class Solution050 {
    public char firstUniqChar(String s) {
        char ans = ' ';
        Map<Character, Integer> map = new HashMap<>();

        if ("".equals(s)) return ans;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution050().firstUniqChar("leetcode");
    }
}
