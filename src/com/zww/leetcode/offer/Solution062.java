package com.zww.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 *
 * @author 半山兄
 * @since 2022/06/09
 */
public class Solution062 {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
