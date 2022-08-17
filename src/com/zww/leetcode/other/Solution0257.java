package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 *
 * @author weiwei.zhao
 * @since 2022/05/25
 */
public class Solution0257 {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return ans;
        dfs(root, "");
        return ans;
    }

    public void dfs(TreeNode root, String str) {
        if (root == null) return;
        str += root.val;
        if (root.left == null && root.right == null) {
            ans.add(str);
            return;
        }
        str += "->";
        dfs(root.left, str);
        dfs(root.right, str);
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node5, null);
        TreeNode node1 = new TreeNode(1, node2, node3);
        new Solution0257().binaryTreePaths(node1);
    }
}
