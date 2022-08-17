package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 654. ×î´ó¶þ²æÊ÷
 *
 * @author weiwei.zhao
 * @since 2022/07/13
 */
public class Solution0654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {

        if (start > end) return null;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode ans = new TreeNode(max);
        TreeNode left = constructMaximumBinaryTree(nums, start, index - 1);
        TreeNode right = constructMaximumBinaryTree(nums, index + 1, end);
        ans.left = left;
        ans.right = right;
        return ans;
    }

    public static void main(String[] args) {
        new Solution0654().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }
}
