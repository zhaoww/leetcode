package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 1022. 从根到叶的二进制数之和
 *
 * @author weiwei.zhao
 * @since 2022/05/30
 */
public class Solution1022 {

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode node, int sum) {
        if (node == null) return 0;
        sum = sum * 2 + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return dfs(node.left, sum) + dfs(node.right, sum);
    }

    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(0);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(0, t1, t2);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1, t0, t4);
        TreeNode t6 = new TreeNode(1, t3, t5);
        new Solution1022().sumRootToLeaf(t6);
    }
}
