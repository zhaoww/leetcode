package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution102 {
    public List<List<Integer>> ans = new ArrayList<>();

    /**
     * 普通遍历
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return ans;
        List<Integer> list = new ArrayList<>(1);
        list.add(root.val);
        ans.add(list);
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        levelOrder(nodeList);
        return ans;
    }

    public void levelOrder(List<TreeNode> nodeList) {
        if (nodeList.size() == 0) return;
        List<TreeNode> subTreeNodeList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nodeList.size(); i++) {
            TreeNode node = nodeList.get(i);
            if (node.left != null) {
                list.add(node.left.val);
                subTreeNodeList.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right.val);
                subTreeNodeList.add(node.right);
            }
        }
        if (list.size() > 0) ans.add(list);
        levelOrder(subTreeNodeList);
    }

    /**
     * bfs
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) return ans;
        Deque<TreeNode> deque = new ArrayDeque();
        deque.add(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                list.add(node.val);
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(7);
        TreeNode t3 = new TreeNode(6, t1, t2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5, t4, t3);
        new Solution102().levelOrder2(t5);
    }
}
