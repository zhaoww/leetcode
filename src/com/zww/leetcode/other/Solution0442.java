package com.zww.leetcode.other;

import java.util.*;

/**
 * 442. 数组中重复的数据
 *
 * @author 半山兄
 * @since 2022/05/08
 */
public class Solution0442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) ans.add(num);
        }
        return ans;
    }

    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0, k = 1; i < nums.length; i++) {
            if (nums[i] < k) {
                ans.add(nums[i]);
            } else {
                k = nums[i] + 1;
            }
        }
        return ans;
    }

    public List<Integer> findDuplicates3(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int index = Math.abs(num) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                duplicates.add(index + 1);
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        new Solution0442().findDuplicates3(new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7});
    }
}
