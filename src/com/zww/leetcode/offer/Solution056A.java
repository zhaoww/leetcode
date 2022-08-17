package com.zww.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 剑指 Offer 56 - I. 数组中数字出现的次数
 * todo 异或处理
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution056A {

    public int[] singleNumbers(int[] nums) {
        List<Integer> ansList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0, len = nums.length; i < len; i++) {
            if ((i == 0 && nums[i] != nums[i + 1]) ||
                    (i == len - 1 && nums[i] != nums[i - 1]) ||
                    (i > 0 && i < len - 1 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]))
                ansList.add(nums[i]);
        }
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}
