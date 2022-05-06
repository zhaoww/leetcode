package com.zww.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 *
 * @author weiwei.zhao
 * @since 2022/05/06
 */
public class Solution048 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            ans = Math.max(ans, i - left);
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution048().lengthOfLongestSubstring("abbcdea");
    }
}
