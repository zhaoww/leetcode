package com.zww.leetcode.hot;

/**
 * 136. 只出现一次的数字
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution136 {

    /**
     * 异或
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        new Solution136().singleNumber(new int[]{1, 2, 3, 1, 2, 4, 4});
    }
}
