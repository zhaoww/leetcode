package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 501. 二叉搜索树中的众数
 *
 * @author weiwei.zhao
 * @since 2022/05/27
 */
public class Solution0501 {
    List<Integer> ansList = new ArrayList<>();
    int maxCnt = 0;
    int curCnt = 0;
    int pre = Integer.MAX_VALUE;

    public int[] findMode(TreeNode root) {
        dfs(root);

        int[] arr = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            arr[i] = ansList.get(i);
        }
        return arr;
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (root.val == pre) {
            curCnt++;
        } else {
            pre = root.val;
            curCnt = 1;
        }
        if (curCnt > maxCnt) {
            maxCnt = curCnt;
            ansList.clear();
            ansList.add(root.val);
        } else if (curCnt == maxCnt) {
            ansList.add(root.val);
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0, node5, null);
        TreeNode node1 = new TreeNode(1, node2, node3);
        new Solution0501().findMode(node1);
    }
}
