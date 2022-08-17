package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 112. 路径总和
 *
 * @author weiwei.zhao
 * @since 2022/05/23
 */
public class Solution0112 {
    boolean ans = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        dfs(root, targetSum);
        return ans;
    }

    /**
     * 构建一个总和树
     *
     * @param root
     * @param targetSum
     */
    public void dfs(TreeNode root, int targetSum) {
        if (ans == true) return;

        if (root.left != null) {
            root.left.val += root.val;
            dfs(root.left, targetSum);
        }
        if (root.right != null) {
            root.right.val += root.val;
            dfs(root.right, targetSum);
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            ans = true;
            return;
        }
    }

    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(-3, null, null);
        TreeNode node = new TreeNode(-2, null, node2);
        new Solution0112().hasPathSum(node, -5);
    }
}
