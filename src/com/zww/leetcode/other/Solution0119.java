package com.zww.leetcode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 *
 * @author weiwei.zhao
 * @since 2022/05/18
 */
public class Solution0119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> initdp = new ArrayList<>();
        initdp.add(1);
        ans.add(initdp);
        if (rowIndex == 1) {
            return initdp;
        }
        for (int i = 1; i < rowIndex; i++) {
            List<Integer> preDp = ans.get(i - 1);
            List<Integer> dp = new ArrayList<>();
            dp.add(1);
            for (int j = 1; j < i; j++) {
                dp.add(preDp.get(j - 1) + preDp.get(j));
            }
            dp.add(1);
            ans.add(dp);
        }
        return ans.get(rowIndex - 1);
    }
}
