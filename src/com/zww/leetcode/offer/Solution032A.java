package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 *
 * @author 半山兄
 * @since 2022/06/05
 */
public class Solution032A {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> ansList = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);

        while (!linkedList.isEmpty()) {
            TreeNode node = linkedList.pollFirst();
            ansList.add(node.val);
            if (node.left != null) linkedList.add(node.left);
            if (node.right != null) linkedList.add(node.right);
        }
        int len = ansList.size();
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

}
