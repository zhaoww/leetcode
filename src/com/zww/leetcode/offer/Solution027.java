package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 剑指 Offer 27. 二叉树的镜像
 *
 * @author weiwei.zhao
 * @since 2022/06/01
 */
public class Solution027 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode p = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(p);
        return root;
    }
}
