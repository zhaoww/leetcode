package com.zww.leetcode.other;

/**
 * 944. 删列造序
 *
 * @author weiwei.zhao
 * @since 2022/05/12
 */
public class Solution0944 {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char pre = 'a';
            for (String str : strs) {
                if (str.charAt(i) >= pre) {
                    pre = str.charAt(i);
                } else {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
