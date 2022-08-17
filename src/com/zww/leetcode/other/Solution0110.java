package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 110. 平衡二叉树
 *
 * @author weiwei.zhao
 * @since 2022/05/23
 */
public class Solution0110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    public static void main(String[] args) {

        TreeNode t8 = new TreeNode(8, null, null);
        TreeNode t7 = new TreeNode(7, null, null);
        TreeNode t6 = new TreeNode(6, null, null);
        TreeNode t5 = new TreeNode(5, null, null);
        TreeNode t4 = new TreeNode(4, t8, null);
        TreeNode t3 = new TreeNode(3, t6, null);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t1 = new TreeNode(1, t2, t3);
        new Solution0110().isBalanced(t1);
    }
}
