package com.zww.leetcode.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 380. O(1) 时间插入、删除和获取随机元素
 *
 * @author 半山兄
 * @since 2022/07/07
 */
public class Solution0380 {
    int[] nums = new int[200010];
    Random random;
    Map<Integer, Integer> map;
    int idx = -1;

    public Solution0380() {
        random = new Random();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        nums[++idx] = val;
        map.put(val, idx);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int loc = map.remove(val);
        if (loc != idx) map.put(nums[idx], loc);
        nums[loc] = nums[idx--];
        return true;
    }

    public int getRandom() {
        return nums[random.nextInt(idx + 1)];
    }
}
