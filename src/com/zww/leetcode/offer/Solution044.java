package com.zww.leetcode.offer;

/**
 * 剑指 Offer 44. 数字序列中某一位的数字
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution044 {
    // 各 digitdigit 下的数位数量 countcount 的计算公式
    // count=9×start×digit

    // 确定 nn 所在 数字 的 位数 ，记为 digitdigit ；
    // 确定 nn 所在的 数字 ，记为 numnum ；
    // 确定 nn 是 numnum 中的哪一数位，并返回结果
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
