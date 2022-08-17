package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 236. 二叉树的最近公共祖先
 *
 * @author weiwei.zhao
 * @since 2022/05/24
 */
public class Solution0236 {
    boolean pFind = false;
    boolean qFind = false;
    List<TreeNode> pList = new ArrayList<>();
    List<TreeNode> qList = new ArrayList<>();
    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // dfs 记录查找路径
        dfs(root, p.val, q.val, new ArrayList<>());
        // 查找最远的公共节点
        compare(pList, qList);
        return ans;
    }

    public void dfs(TreeNode node, int valueP, int valueQ, List<TreeNode> list) {
        if (node == null) return;
        list.add(node);
        // 两个节点都找到那么提前结束遍历
        if (node.val == valueP) {
            pFind = true;
            pList = new ArrayList<>(list);
            if (qFind == true) return;
        }
        if (node.val == valueQ) {
            qFind = true;
            qList = new ArrayList<>(list);
            if (pFind == true) return;
        }
        dfs(node.left, valueP, valueQ, list);
        dfs(node.right, valueP, valueQ, list);
        list.remove(list.size() - 1);
    }

    public void compare(List<TreeNode> pList, List<TreeNode> qList) {
        int len = Math.min(pList.size(), qList.size());
        for (int i = 0; i < len; i++) {
            if (pList.get(i).val != qList.get(i).val) return;
            ans = pList.get(i);
        }
    }

    /**
     * 方法二
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        return travelTree(root, p, q);
    }

    public TreeNode travelTree(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = travelTree(root.left, p, q);
        TreeNode right = travelTree(root.right, p, q);
        // 某个节点的左右节点 分别找到
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
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
        new Solution0236().lowestCommonAncestor(node3, node5, node1);
    }
}
