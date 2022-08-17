package com.zww.leetcode.offer;

/**
 * 剑指 Offer 20. 表示数值的字符串
 *
 * @author weiwei.zhao
 * @since 2022/06/01
 */
public class Solution020 {
    public boolean isNumber(String s) {
        // 去除空格
        char[] arr = s.trim().toCharArray();
        int len = arr.length;
        if (len == 0) return false;
        int index = 0;
        // 跳过符号
        if (arr[index] == '+' || arr[index] == '-') index++;

        int tmp = index;
        index = scanInteger(arr, index);
        boolean flag = index > tmp;
        // 小数
        if (index < len && arr[index] == '.') {
            index++;
            tmp = index;
            index = scanInteger(arr, index);
            flag = (index > tmp) || flag;
        }
        // e
        if (index < len && (arr[index] == 'e' || arr[index] == 'E')) {
            index++;
            // 跳过符号
            if (index < len && (arr[index] == '+' || arr[index] == '-')) index++;
            tmp = index;
            // 整数
            index = scanInteger(arr, index);
            flag = (index > tmp) && flag;
        }
        return flag && index == len;
    }

    public int scanInteger(char[] arr, int index) {
        for (int len = arr.length; index < len && arr[index] >= '0' && arr[index] <= '9'; index++) {
        }
        return index;
    }

}
