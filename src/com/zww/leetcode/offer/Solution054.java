package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 *
 * @author weiwei.zhao
 * @since 2022/06/07
 */
public class Solution054 {
    int n = 0;
    int ans = 0;

    public int kthLargest(TreeNode root, int k) {
        n = k;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        if (n-- == 0) {
            ans = root.val;
            return;
        }
        dfs(root.left);
    }

}
