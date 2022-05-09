package com.zww.leetcode.other;

/**
 * 942. 增减字符串匹配
 *
 * @author weiwei.zhao
 * @since 2022/05/09
 */
public class Solution0942 {
    public int[] diStringMatch(String s) {
        int ans[] = new int[s.length() + 1];
        int len = s.length();
        int max = len;
        int min = 0;

        // 取值最大最小即可
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = min++;
            } else {
                ans[i] = max--;
            }
        }

        ans[len] = max;
        return ans;
    }

    public static void main(String[] args) {
        new Solution0942().diStringMatch("IDID");
    }
}
