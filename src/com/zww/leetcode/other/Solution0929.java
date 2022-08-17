package com.zww.leetcode.other;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. 独特的电子邮件地址
 *
 * @author 半山兄
 * @since 2022/06/04
 */
public class Solution0929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            String[] split = email.split("@");
            if (split.length == 2) {
                char[] chars = split[0].toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == '.') continue;
                    if (chars[i] == '+') break;
                    sb.append(chars[i]);
                }
                sb.append("@");
                sb.append(split[1]);
                set.add(sb.toString());
            }
        }
        return set.size();
    }
}
