package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 701. 二叉搜索树中的插入操作
 *
 * @author weiwei.zhao
 * @since 2022/07/18
 */
public class Solution0701 {
    boolean flag = false;

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (flag) return root;
        if (root == null) return new TreeNode(val);

        if (root.val > val) {
            TreeNode node = insertIntoBST(root.left, val);
            root.left = node;
            flag = true;
        } else if (root.val < val) {
            TreeNode node = insertIntoBST(root.right, val);
            root.right = node;
            flag = true;
        }
        return root;
    }
}
