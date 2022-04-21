package com.zww.leetcode.common.struct;

/**
 * Definition for a binary tree node.
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
