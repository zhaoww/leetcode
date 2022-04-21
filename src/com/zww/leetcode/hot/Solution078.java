package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution078 {

    public List<List<Integer>> subsets(int[] nums) {
        return dfs(nums, new ArrayList<>(), new ArrayList<>(), 0);
    }

    /**
     * 回溯
     *
     * @param nums
     * @param retList
     * @param curList
     * @param index
     * @return
     */
    public List<List<Integer>> backtrack(int[] nums, List<List<Integer>> retList, List<Integer> curList, int index) {
        retList.add(new ArrayList<>(curList));
        for (int i = index; i < nums.length; i++) {
            curList.add(nums[i]);
            backtrack(nums, retList, curList, i + 1);
            curList.remove(curList.size() - 1);
        }
        return retList;
    }

    /**
     * dfs
     *
     * @param nums
     * @param retList
     * @param curList
     * @param index
     * @return
     */
    public List<List<Integer>> dfs(int[] nums, List<List<Integer>> retList, List<Integer> curList, int index) {
        if (index == nums.length) {
            retList.add(new ArrayList<>(curList));
            return retList;
        }
        curList.add(nums[index]);
        dfs(nums, retList, curList, index + 1);
        curList.remove(curList.size() - 1);
        dfs(nums, retList, curList, index + 1);
        return retList;
    }


    public static void main(String[] args) {
        new Solution078().subsets(new int[]{1, 2, 3, 4});
    }
}
