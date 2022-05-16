package com.zww.leetcode.caseinterview;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 面试题 04.06. 后继者
 *
 * @author weiwei.zhao
 * @since 2022/05/16
 */
public class Solution04_06 {
    // 0 未查找到 1 查找到 2 处理完成
    int find = 0;
    TreeNode ans = null;

    /**
     * 中序遍历
     *
     * @param root
     * @param p
     * @return
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root, p);
        return ans;
    }

    public void dfs(TreeNode node, TreeNode p) {
        if (node == null || find == 2) return;
        dfs(node.left, p);
        if (find == 1) {
            ans = node;
            find = 2;
            return;
        }
        System.out.println(node.val);
        if (node == p) find = 1;
        dfs(node.right, p);
    }

    /**
     * 查找
     *
     * @param root
     * @param p
     * @return
     */
    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        TreeNode ans = null;
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val > p.val) {
                ans = cur;
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(1);
        TreeNode t1 = new TreeNode(2, t0, null);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t1, t2);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5, t3, t4);
        new Solution04_06().inorderSuccessor(t5, t0);
    }
}
