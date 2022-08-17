package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 112. 路径总和 II
 *
 * @author weiwei.zhao
 * @since 2022/05/23
 */
public class Solution0113 {
    List<List<Integer>> ansList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return ansList;
        List<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        dfs(root, targetSum, ans);
        return ansList;
    }

    /**
     * 构建一个总和树
     *
     * @param root
     * @param targetSum
     */
    public void dfs(TreeNode root, int targetSum, List<Integer> ans) {
        if (root.left != null) {
            ans.add(root.left.val);
            root.left.val += root.val;
            dfs(root.left, targetSum, ans);
            ans.remove(ans.size() - 1);
        }
        if (root.right != null) {
            ans.add(root.right.val);
            root.right.val += root.val;
            dfs(root.right, targetSum, ans);
            ans.remove(ans.size() - 1);
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            ansList.add(new ArrayList<>(ans));
            return;
        }
    }

    public static void main(String[] args) {
        TreeNode node2 = new TreeNode(-3, null, null);
        TreeNode node = new TreeNode(-2, null, node2);
        new Solution0113().pathSum(node, -5);
    }
}
