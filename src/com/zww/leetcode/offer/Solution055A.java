package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.LinkedList;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 *
 * @author weiwei.zhao
 * @since 2022/06/06
 */
public class Solution055A {
    public int maxDepth(TreeNode root) {
        int ans = 0;
        if (root == null) return ans;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ans++;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode pop = queue.pop();
                if (pop.left != null) queue.add(pop.left);
                if (pop.right != null) queue.add(pop.right);
            }
        }
        return ans;
    }
}
