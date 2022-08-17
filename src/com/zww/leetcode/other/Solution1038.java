package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 1038. 从二叉搜索树到更大和树
 *
 * @author weiwei.zhao
 * @since 2022/07/18
 */
public class Solution1038 {
    int pre = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;
        bstToGst(root.right);
        root.val += pre;
        pre = root.val;
        bstToGst(root.left);
        return root;
    }
}
