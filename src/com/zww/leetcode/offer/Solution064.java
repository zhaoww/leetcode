package com.zww.leetcode.offer;

/**
 * 剑指 Offer 64. 求1+2+…+n
 *
 * @author 半山兄
 * @since 2022/06/16
 */
public class Solution064 {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
