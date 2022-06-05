package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 剑指 Offer 28. 对称的二叉树
 *
 * @author 半山兄
 * @since 2022/06/02
 */
public class Solution028 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null) {
            if (left.val == right.val) {
                return compare(left.left, right.right) && compare(right.left, left.right);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
