package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. 二叉树的层序遍历 II
 *
 * @author 半山兄
 * @since 2022/07/08
 */
public class Solution0107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<>();
        if (root == null) return ansList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode poll = queue.poll();
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
                list.add(poll.val);
                size--;
            }
            ansList.add(0, list);
        }
        return ansList;
    }
}
