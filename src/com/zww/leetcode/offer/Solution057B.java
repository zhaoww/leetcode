package com.zww.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 *
 * @author weiwei.zhao
 * @since 2022/06/07
 */
public class Solution057B {
    public int[][] findContinuousSequence(int target) {
        List<int[]> ansList = new ArrayList<>();
        int end = target / 2 + (target % 2 == 0 ? 0 : 1);
        for (int i = 1; i <= end; i++) {
            int sum = i;
            for (int j = i + 1; j <= end; j++) {
                sum += j;
                if (sum == target) {
                    int[] res = new int[j - i + 1];
                    for (int k = i; k <= j; ++k) {
                        res[k - i] = k;
                    }
                    ansList.add(res);
                } else if (sum > target) {
                    break;
                }
            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }

    /**
     * 滑动窗口
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence2(int target) {
        List<int[]> ansList = new ArrayList<>();
        int i = 1, j = 2, s = 3;
        while (i < j) {
            if (s > target) {
                s -= i;
                i++;
            } else if (s < target) {
                j++;
                s += j;
            } else {
                int[] res = new int[j - i + 1];
                for (int k = i; k <= j; ++k) {
                    res[k - i] = k;
                }
                ansList.add(res);
                s -= i;
                i++;
            }
        }

        return ansList.toArray(new int[ansList.size()][]);
    }

    public static void main(String[] args) {
        new Solution057B().findContinuousSequence2(9);
    }
}
