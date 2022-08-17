package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 111. 二叉树的最小深度
 *
 * @author weiwei.zhao
 * @since 2022/05/23
 */
public class Solution0111 {
    int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return min;
    }

    public void dfs(TreeNode root, int depth) {
        // 如果为空或者深度超了 就不再继续往子树找
        if (root == null || depth++ >= min) return;
        if (root.left == null && root.right == null) {
            min = Math.min(depth, min);
            return;
        }
        dfs(root.left, depth);
        dfs(root.right, depth);
    }

    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(1);
        TreeNode t1 = new TreeNode(2, t0, null);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t1, t2);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5, t3, t4);
//        TreeNode t0 = new TreeNode(6);
//        TreeNode t1 = new TreeNode(5, t0, null);
//        TreeNode t2 = new TreeNode(4, t1, null);
//        TreeNode t3 = new TreeNode(3, t2, null);
//        TreeNode t4 = new TreeNode(2, t3, null);
//        TreeNode t5 = new TreeNode(1, t4, null);
        new Solution0111().minDepth(t5);
    }
}
