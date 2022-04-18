package com.zww.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 *
 * @author weiwei.zhao
 * @since 2022/04/14
 */
public class Solution001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 7, 8};
        System.out.println(new Solution001().twoSum(numbers, 4));
    }
}
