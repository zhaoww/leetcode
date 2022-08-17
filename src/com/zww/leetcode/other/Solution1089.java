package com.zww.leetcode.other;

/**
 * 1089. 复写零
 *
 * @author weiwei.zhao
 * @since 2022/06/17
 */
public class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int cnt = 0;
        // 后面的0 不在统计内
        for (int i = 0; i < len - cnt; i++) {
            if (arr[i] == 0) cnt++;
        }

        for (int j = len - 1; j > 0; j--) {
            arr[j] = arr[j - cnt];
            if (arr[j - cnt] == 0) {
                arr[j - 1] = 0;
                j--;
                cnt--;
            }
        }
    }

    public static void main(String[] args) {
        new Solution1089().duplicateZeros(new int[]{8, 4, 5, 0, 0, 0, 0, 7});
    }
}
