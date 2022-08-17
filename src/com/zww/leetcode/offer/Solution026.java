package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 剑指 Offer 26. 树的子结构
 *
 * @author 半山兄
 * @since 2022/06/04
 */
public class Solution026 {
    public static void main(String[] args) {
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(11);
        TreeNode node5 = new TreeNode(3);
        TreeNode node4 = new TreeNode(8);
        TreeNode node3 = new TreeNode(6, node6, null);
        TreeNode node2 = new TreeNode(12, node4, node5);
        TreeNode node = new TreeNode(10, node2, node3);

        TreeNode subnode4 = new TreeNode(8);
        TreeNode subnode3 = new TreeNode(6);
        TreeNode subnode2 = new TreeNode(12, subnode4,null);
        TreeNode sub = new TreeNode(10, subnode2, subnode3);
        new Solution026().isSubStructure(node, sub);
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return false;
        return dfs(A, B);
    }

    public boolean dfs(TreeNode node, TreeNode sub) {
        if (node == null) return false;
        if (node.val == sub.val) {
            if (sub.left == null && sub.right == null) {
                return true;
            } else {
                boolean res = subDfs(node.left, sub.left) && subDfs(node.right, sub.right);
                if (res) return true;
            }
        }
        return dfs(node.left, sub) || dfs(node.right, sub);
    }

    public boolean subDfs(TreeNode node, TreeNode sub) {
        if (sub == null) {
            return true;
        } else {
            if (node != null && node.val == sub.val) {
                if (sub.left == null && sub.right == null) {
                    return true;
                } else {
                    return subDfs(node.left, sub.left) && subDfs(node.right, sub.right);
                }
            }
        }
        return false;
    }
}
