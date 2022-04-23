package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 104. 二叉树的最大深度
 *
 * @author 半山兄
 * @since 2022/04/23
 */
public class Solution104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(this.maxDepth(root.left), this.maxDepth(root.right)) + 1;
    }

}
