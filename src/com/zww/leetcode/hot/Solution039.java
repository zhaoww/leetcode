package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. 组合总和
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution039 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, new ArrayList<>(), target, 0);
        return ans;
    }

    public void backtrack(int[] candidates, List<Integer> list, int target, int index) {
        int sum = listSum(list);
        if (sum >= target) {
            if (sum == target) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtrack(candidates, list, target, i);
            list.remove(list.size() - 1);
        }
    }

    public int listSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        new Solution039().combinationSum(new int[]{2, 3, 6, 7}, 7);
    }
}
