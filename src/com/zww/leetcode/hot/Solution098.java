package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 98. 验证二叉搜索树
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution098 {

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) {
            return false;
        }

        return valid(node.left, min, node.val) && valid(node.right, node.val, max);
    }

    // 中序遍历
    long minValue = Long.MIN_VALUE;

    public boolean isValidBST2(TreeNode root) {
        return inorder(root);
    }

    public boolean inorder(TreeNode node) {
        if (node == null) return true;
        boolean left = inorder(node.left);
        if (node.val <= minValue) return false;
        minValue = node.val;
        boolean right = inorder(node.right);
        return left && right;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(7);
        TreeNode t3 = new TreeNode(6, t1, t2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5, t4, t3);
        new Solution098().isValidBST2(t5);
    }

}
