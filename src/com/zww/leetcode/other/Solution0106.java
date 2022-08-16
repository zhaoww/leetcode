package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 *
 * @author 半山兄
 * @since 2022/07/02
 */
public class Solution0106 {
    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        new Solution0106().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i], i);
        }
        return dfs(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode dfs(int[] postorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr) return null;
        int k = map.get(postorder[pr]);
        TreeNode node = new TreeNode(postorder[pr]);
        node.left = dfs(postorder, pl, pl + k - il - 1, inorder, il, k - 1);
        node.right = dfs(postorder, pl + k - il, pr - 1, inorder, k + 1, ir);
        return node;
    }
}
