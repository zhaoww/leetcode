package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution056 {

    public int[][] merge(int[][] intervals) {
        // 先排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1) {
                ans.add(intervals[i]);
                break;
            }
            if (intervals[i][1] >= intervals[i + 1][1]) {
                intervals[i + 1] = new int[]{intervals[i][0], intervals[i][1]};
            } else {
                if (intervals[i + 1][0] > intervals[i][1]) {
                    ans.add(intervals[i]);
                } else {
                    intervals[i + 1] = new int[]{intervals[i][0], intervals[i + 1][1]};
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{new int[]{1, 3}, new int[]{2, 6}, new int[]{8, 10}, new int[]{15, 18}};
        new Solution056().merge(intervals);
    }
}
