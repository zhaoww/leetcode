package com.zww.leetcode.tencent;

/**
 * 7. 整数反转
 *
 * @author weiwei.zhao
 * @since 2022/04/26
 */
public class Solution007 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;
            //判断是否 大于 最大32位整数
            if (ans > 214748364 || (ans == 214748364 && digit > 7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (ans < -214748364 || (ans == -214748364 && digit < -8)) {
                return 0;
            }
            ans = ans * 10 + digit;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution007().reverse(-12345);
    }
}
