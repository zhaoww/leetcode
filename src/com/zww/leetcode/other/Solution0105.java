package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * @author 半山兄
 * @since 2022/07/02
 */
public class Solution0105 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i], i);
        }
        return dfs(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode dfs(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr) return null;
        int k = map.get(preorder[pl]);
        TreeNode node = new TreeNode(preorder[pl]);
        node.left = dfs(preorder, pl + 1, pl + k - il, inorder, il, k - 1);
        node.right = dfs(preorder, pl + k - il + 1, pr, inorder, k + 1, ir);
        return node;
    }
}
