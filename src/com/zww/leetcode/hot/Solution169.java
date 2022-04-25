package com.zww.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 *
 * @author weiwei.zhao
 * @since 2022/04/25
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int cnt = map.get(num).intValue() + 1;
                if (cnt > nums.length / 2) return num;
                map.put(num, cnt);
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }
}
