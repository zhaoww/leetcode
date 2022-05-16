package com.zww.leetcode.offer;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 *
 * @author weiwei.zhao
 * @since 2022/05/10
 */
public class Solution046 {

    int ans = 0;

    public int translateNum(int num) {
        String str = String.valueOf(num);
        backtrack(str, 0, str.length());
        return ans;
    }

    public void backtrack(String str, int index, int len) {
        if (index >= len - 1) {
            ans++;
            return;
        }
        // 一个
        backtrack(str, index + 1, len);

        // 两个
        if (index + 2 <= len && str.charAt(index) != '0') {
            int tmp = Integer.valueOf(str.substring(index, index + 2));
            if (tmp <= 25) {
                backtrack(str, index + 2, len);
            }
        }
    }

    public static void main(String[] args) {
        new Solution046().translateNum(12258);
    }
}
