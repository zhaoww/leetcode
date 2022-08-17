package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 *
 * @author 半山兄
 * @since 2022/06/05
 */
public class Solution032B {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<>();
        if (root == null) return ansList;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);

        while (!linkedList.isEmpty()) {
            int len = linkedList.size();

            List<Integer> tmp = new ArrayList<>();
            while (len >0){
                TreeNode node = linkedList.pollFirst();
                tmp.add(node.val);
                if (node.left != null) linkedList.add(node.left);
                if (node.right != null) linkedList.add(node.right);
                len--;
            }
            ansList.add(tmp);
        }
        return ansList;
    }

}
