package com.zww.leetcode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * @author weiwei.zhao
 * @since 2022/05/18
 */
public class Solution0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> initdp = new ArrayList<>();
        initdp.add(1);
        ans.add(initdp);
        if (numRows == 1) {
            return ans;
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> preDp = ans.get(i - 1);
            List<Integer> dp = new ArrayList<>();
            dp.add(1);
            for (int j = 1; j < i; j++) {
                dp.add(preDp.get(j - 1) + preDp.get(j));
            }
            dp.add(1);
            ans.add(dp);
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution0118().generate(5);
    }
}
