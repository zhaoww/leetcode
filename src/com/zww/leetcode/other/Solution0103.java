package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 103. 二叉树的锯齿形层序遍历
 *
 * @author weiwei.zhao
 * @since 2022/05/25
 */
public class Solution0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        boolean flag = true;
        while (!deque.isEmpty()) {
            int len = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode pop = deque.pop();
                // 标记正向反向
                if (flag) {
                    list.add(pop.val);
                } else {
                    list.add(0, pop.val);
                }
                if (pop.left != null) deque.add(pop.left);
                if (pop.right != null) deque.add(pop.right);
            }
            ans.add(list);
            flag = !flag;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node0 = new TreeNode(0);
        TreeNode node1 = new TreeNode(1, node0, node8);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2, node7, node4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5, node6, node2);
        TreeNode node3 = new TreeNode(3, node5, node1);
        new Solution0103().zigzagLevelOrder(node3);
    }
}
