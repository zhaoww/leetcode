package com.zww.leetcode.other;

/**
 * 1108. IP 地址无效化
 *
 * @author weiwei.zhao
 * @since 2022/06/21
 */
public class Solution1108 {
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                ans.append('[').append('.').append(']');
            } else {
                ans.append(chars[i]);
            }
        }
        return ans.toString();
    }
}
