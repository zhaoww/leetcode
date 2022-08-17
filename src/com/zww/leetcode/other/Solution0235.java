package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 *
 * @author weiwei.zhao
 * @since 2022/05/24
 */
public class Solution0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) {
            // 处于右子树
            return lowestCommonAncestor(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            // 处于左子树
            return lowestCommonAncestor(root.left, p, q);
        } else{
            // 处于左右子树
            return root;
        }
    }
}
