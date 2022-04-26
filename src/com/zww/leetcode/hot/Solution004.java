package com.zww.leetcode.hot;

/**
 * 4. 寻找两个正序数组的中位数
 *
 * @author weiwei.zhao
 * @since 2022/04/26
 */
public class Solution004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (k <= arr.length / 2) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    arr[k++] = nums1[i++];
                } else if (nums1[i] >= nums2[j]) {
                    arr[k++] = nums2[j++];
                }
            } else if (i >= nums1.length) {
                arr[k++] = nums2[j++];
            } else {
                arr[k++] = nums1[i++];
            }
        }

        return arr.length % 2 == 0 ? (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0 : arr[arr.length / 2];
    }
}
