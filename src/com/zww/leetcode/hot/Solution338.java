package com.zww.leetcode.hot;

/**
 * 338. 比特位计数
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution338 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = bitCount(i);
//            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }

    public int bitCount(int i) {
        int ans = 0;
        while (i != 0) {
            ans += i & 1;
            i >>= 1;
        }
        return ans;
    }

    /**
     * 优化
     * @param n
     * @return
     */
    public int[] countBits2(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if ((i & 1) == 1) {
                ans[i] = ans[i >> 1] + 1;
            } else {
                ans[i] = ans[i >> 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution338().countBits2(2);
    }
}
