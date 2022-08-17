package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.Arrays;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @author weiwei.zhao
 * @since 2022/05/25
 */
public class Solution0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int mid = nums.length / 2;
        TreeNode left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        TreeNode right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        TreeNode root = new TreeNode(nums[mid], left, right);
        return root;
    }

    public static void main(String[] args) {
        new Solution0108().sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }

}
