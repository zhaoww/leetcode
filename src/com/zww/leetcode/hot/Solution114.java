package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 114. 二叉树展开为链表
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution114 {

    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(root, list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode prev = list.get(i - 1);
            TreeNode curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

    public void preOrder(TreeNode node, List<TreeNode> list) {
        if (node == null) return;
        list.add(node);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(7);
        TreeNode t3 = new TreeNode(6, t1, t2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5, t4, t3);
        new Solution114().flatten(t5);
    }
}
