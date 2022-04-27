package com.zww.leetcode.hot;

/**
 * 461. 汉明距离
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution461 {
    /**
     * 记 s=x⊕y，我们可以不断地检查 s的最低位，如果最低位为 1，那么令计数器加一，然后我们令 s 整体右移一位
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int ans = 0;
        int s = x ^ y;
        while (s != 0) {
            ans += s & 1;
            s >>= 1;
        }
        return ans;
    }
}
