package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @author weiwei.zhao
 * @since 2022/04/21
 */
public class Solution094 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            ans.add(node.val);
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3, t1, t2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5, t2, t4);
        TreeNode t6 = new TreeNode(6, t3, t5);

        new Solution094().inorderTraversal(t6);
    }
}
