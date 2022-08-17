package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 623. 在二叉树中增加一行
 *
 * @author weiwei.zhao
 * @since 2022/08/05
 */
public class Solution0623 {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        bfs(root, val, depth);
        return root;
    }

    public void bfs(TreeNode root, int val, int depth) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int cnt = 1;
        while (!queue.isEmpty()) {
            cnt++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                TreeNode left = poll.left;
                TreeNode right = poll.right;
                if (cnt == depth) {
                    poll.left = new TreeNode(val, left, null);
                    poll.right = new TreeNode(val, null, right);
                }
                if (left != null) queue.add(left);
                if (right != null) queue.add(right);
            }
        }
    }
}
