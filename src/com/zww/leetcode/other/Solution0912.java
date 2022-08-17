package com.zww.leetcode.other;

/**
 * 912. 排序数组
 *
 * @author weiwei.zhao
 * @since 2022/07/15
 */
public class Solution0912 {
    int[] tmp;

    public int[] sortArray(int[] nums) {
        tmp = new int[nums.length];
//        mergeSort(nums, 0, nums.length - 1);
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if (low == high) return;
        int mid = low + (high - low) / 2;
        // 分治
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        // 归并
        merge(nums, low, mid, high);

    }

    private void merge(int[] nums, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            tmp[i] = nums[i];
        }

        int i = low, j = mid + 1;
        for (int p = low; p <= high; p++) {
            if (i == mid + 1) {
                nums[p] = tmp[j++];
            } else if (j == high + 1) {
                nums[p] = tmp[i++];
            } else if (tmp[i] > tmp[j]) {
                nums[p] = tmp[j++];
            } else {
                nums[p] = tmp[i++];
            }
        }
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int pivot = nums[low];
        // 切分
        int index = partition(nums, low, high, pivot);
        nums[index] = pivot;
        // 分治
        quickSort(nums, low, index - 1);
        quickSort(nums, index + 1, high);
    }

    private int partition(int[] nums, int low, int high, int pivot) {
        int i = low, j = high;

        while (i < j) {
            // 找第一个右边小于基本
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            // 找第一个左边大于基准
            while (i < j && nums[i] < pivot) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        new Solution0912().sortArray(new int[]{1, 7, 4, 8, 2, 5, 3, 6});
    }
}
