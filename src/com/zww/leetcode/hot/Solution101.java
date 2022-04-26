package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 101. 对称二叉树
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return sym(root.left, root.right);
    }

    public boolean sym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            if (left.val != right.val) return false;
            return sym(left.left, right.right) && sym(left.right, right.left);
        }
    }

}
