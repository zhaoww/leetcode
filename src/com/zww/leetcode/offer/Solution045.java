package com.zww.leetcode.offer;

import java.util.Arrays;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 *
 * @author weiwei.zhao
 * @since 2022/06/10
 */
public class Solution045 {
    public String minNumber(int[] nums) {
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder sb = new StringBuilder();
        for (String s : strArr)
            sb.append(s);
        return sb.toString();
    }

}
