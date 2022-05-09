package com.zww.leetcode.offer;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 *
 * @author weiwei.zhao
 * @since 2022/05/09
 */
public class Solution011 {

    public int minArray(int[] numbers) {
        for (int i = 0, len = numbers.length; i < len - 1; i++) {
            if (numbers[i] > numbers[i + 1]) return numbers[i + 1];
        }
        return numbers[0];
    }
}
