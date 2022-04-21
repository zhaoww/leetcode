package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 448. 找到所有数组中消失的数字
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> all = new HashSet<>();
        for (int i = 1; i <= nums.length; i++) {
            all.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (all.contains(nums[i])) {
                all.remove(nums[i]);
            }
        }
        return new ArrayList<>(all);
    }

    public static void main(String[] args) {
        new Solution448().findDisappearedNumbers(new int[]{1, 2, 0, 3, 0, 4});

    }
}
