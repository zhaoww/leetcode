package com.zww.leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 49. 丑数
 *
 * @author 半山兄
 * @since 2022/06/15
 */
public class Solution049 {
    private Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        new Solution049().nthUglyNumber(10);
    }

    /**
     * timeout
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int index = 0;
        int i = 1;
        while (index < n) {
            if (isUgly(i)) {
                index++;
                set.add(i);
            }
            i++;

        }
        return i - 1;
    }

    public boolean isUgly(int n) {
        while (n % 2 == 0) {
            n /= 2;
            if (set.contains(n)) return true;
        }
        while (n % 3 == 0) {
            n /= 3;
            if (set.contains(n)) return true;
        }
        while (n % 5 == 0) {
            n /= 5;
            if (set.contains(n)) return true;
        }
        return n == 1;
    }

    public int nthUglyNumber2(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n - 1];
    }
}
