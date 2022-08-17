package com.zww.leetcode.other;

/**
 * 1109. 航班预订统计
 *
 * @author weiwei.zhao
 * @since 2022/06/28
 */
public class Solution1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] c = new int[n];
        for (int[] booking : bookings) {
            c[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                c[booking[1]] -= booking[2];
            }
        }

        for (int i = 1; i < n; i++) {
            c[i] += c[i - 1];
        }
        return c;
    }

    public static void main(String[] args) {
        new Solution1109().corpFlightBookings(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5);
    }
}
