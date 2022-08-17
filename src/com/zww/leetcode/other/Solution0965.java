package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 965. 单值二叉树
 *
 * @author weiwei.zhao
 * @since 2022/05/24
 */
public class Solution0965 {
    boolean ans = true;

    public boolean isUnivalTree(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }

    public void dfs(TreeNode node, int value) {
        if (!ans || node == null) return;
        if (node.val != value) {
            ans = false;
            return;
        }
        dfs(node.left, value);
        dfs(node.right, value);
    }
}
