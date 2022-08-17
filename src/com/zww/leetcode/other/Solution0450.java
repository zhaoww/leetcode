package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 450. 删除二叉搜索树中的节点
 *
 * @author weiwei.zhao
 * @since 2022/05/27
 */
public class Solution0450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // 叶子结点
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right != null) {
                // 左右节点都不为空
                // 查找右节点中最小的元素节点作为右节点
                TreeNode minNode = find(root.right);
                // 删除右子树最小的节点
                root.right = deleteNode(root.right, minNode.val);
                minNode.left = root.left;
                minNode.right = root.right;
                root = minNode;
            } else {
                // 只有一个子节点
                if (root.left == null) {
                    return root.right;
                } else {
                    return root.left;
                }
            }
        }
        return root;
    }

    private TreeNode find(TreeNode node) {
        if (node == null) return null;
        TreeNode left = find(node.left);
        return left == null ? node : left;
    }
}
