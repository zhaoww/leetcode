package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. 全排列
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        return backtrack(resList, new ArrayList<>(), nums, 0);
    }

    public List<List<Integer>> backtrack(List<List<Integer>> resList, List<Integer> curList, int[] nums, int index) {
        if (curList.size() == nums.length) {
            List<Integer> tmpList = new ArrayList<>();
            tmpList.addAll(curList);
            resList.add(tmpList);
            return resList;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!curList.contains(nums[i])) {
                curList.add(nums[i]);
                backtrack(resList, curList, nums, index + 1);
                curList.remove(curList.size() - 1);
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        new Solution046().permute(new int[]{1, 2, 3});
    }
}
