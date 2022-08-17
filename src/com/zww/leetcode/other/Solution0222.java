package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 222. 完全二叉树的节点个
 *
 * @author weiwei.zhao
 * @since 2022/07/20
 */
public class Solution0222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
