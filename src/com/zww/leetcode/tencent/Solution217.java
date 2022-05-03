package com.zww.leetcode.tencent;

import java.util.HashMap;
import java.util.Map;

/**
 * 217. 存在重复元素
 *
 * @author 半山兄
 * @since 2022/05/03
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) return true;
            map.put(num, 0);
        }
        return false;
    }
}
