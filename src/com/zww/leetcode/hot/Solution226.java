package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 226. 翻转二叉树
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
