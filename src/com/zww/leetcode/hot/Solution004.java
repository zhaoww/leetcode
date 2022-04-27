package com.zww.leetcode.hot;

/**
 * 4. 寻找两个正序数组的中位数 (todo log(m+n))
 *
 * @author weiwei.zhao
 * @since 2022/04/14
 */
public class Solution004 {
    /**
     * 时间复杂度 (m+n)/2
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (k <= arr.length / 2) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    arr[k++] = nums1[i++];
                } else {
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

    public static void main(String[] args) {
        System.out.println(new Solution004().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
