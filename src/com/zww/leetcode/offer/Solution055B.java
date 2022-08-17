package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution055B {

    boolean ans = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        maxDepth(root);
        return ans;
    }

    public int maxDepth(TreeNode treeNode) {
        if (!ans) return -1;
        if (treeNode == null) return 0;
        int leftDepth = maxDepth(treeNode.left);
        int rightDepth = maxDepth(treeNode.right);
        if (Math.abs(leftDepth - rightDepth) > 1) ans = false;
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
