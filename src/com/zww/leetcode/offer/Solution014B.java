package com.zww.leetcode.offer;

/**
 * 剑指 Offer 14- II. 剪绳子 II
 *
 * @author weiwei.zhao
 * @since 2022/05/17
 */
public class Solution014B {
    public int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        long res = 1;
        while(n > 4){
            res  = res * 3 % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }
}
