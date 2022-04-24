package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution015 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        // 排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // 跳过与上一轮重复的
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                // 跳过与上一轮重复的
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                // nums[j] + nums[k] >= target 减少循环次数
                for (int k = nums.length - 1; k > j && nums[j] + nums[k] >= target; k--) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        ans.add(list);
                        break;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        new Solution015().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
