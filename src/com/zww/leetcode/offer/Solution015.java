package com.zww.leetcode.offer;

/**
 * 剑指 Offer 15. 二进制中1的个数
 *
 * @author 半山兄
 * @since 2022/04/30
 */
public class Solution015 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n & 1;
            //
            n >>>= 1;
        }
        return ans;
    }
}
