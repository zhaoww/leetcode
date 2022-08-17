package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 *
 * @author weiwei.zhao
 * @since 2022/06/14
 */
public class Solution068B {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 某个节点的左右节点 分别找到
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
}
