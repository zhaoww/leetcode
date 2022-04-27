package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 543. 二叉树的直径
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }


    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1, t0, null);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3, t1, t2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5, null, t4);
        TreeNode t6 = new TreeNode(6, t3, t5);

        new Solution543().diameterOfBinaryTree(t6);
    }
}
