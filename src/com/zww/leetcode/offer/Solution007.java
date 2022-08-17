package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 07. 重建二叉树
 *
 * @author weiwei.zhao
 * @since 2022/05/30
 */
public class Solution007 {
    Map<Integer, Integer> map = new HashMap<>();
    int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < preorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(0, 0, inorder.length - 1);
    }

    public TreeNode build(int root, int left, int right) {

        if (left > right) {
            return null;
        }
        // 前序节点就是根
        TreeNode node = new TreeNode(preorder[root]);
        // 根据根节点中序坐标区分左右
        int idx = map.get(preorder[root]);
        node.left = build(root + 1, left, idx - 1);
        node.right = build(root + (idx - 1 - left + 1) + 1, idx + 1, right);
        return node;
    }
}
