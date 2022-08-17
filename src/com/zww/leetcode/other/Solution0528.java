package com.zww.leetcode.other;

/**
 * 528. 按权重随机选择
 *
 * @author weiwei.zhao
 * @since 2022/07/04
 */
public class Solution0528 {
    int[] pSum;

    public Solution0528(int[] w) {
        pSum = new int[w.length + 1];
        for (int i = 0; i < w.length; i++) {
            pSum[i + 1] = pSum[i] + w[i];
        }
    }

    public int pickIndex() {
        int target = (int) (Math.random() * pSum[pSum.length - 1]);
        int start = 0, end = pSum.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > pSum[mid]) {
                start = mid + 1;
            } else if (target < pSum[mid]) {
                if (target > pSum[mid - 1]) {
                    return mid - 1;
                }
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        new Solution0528(new int[]{3, 14, 1, 7}).pickIndex();
    }
}
