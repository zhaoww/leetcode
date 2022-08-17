package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 230. 二叉搜索树中第K小的元素
 *
 * @author 半山兄
 * @since 2022/07/17
 */
public class Solution0230 {
    int ans = 0;
    int cnt = 0;
    boolean flag = false;

    public int kthSmallest(TreeNode root, int k) {
        if (flag || root == null) return ans;
        kthSmallest(root.left, k);
        if (++cnt == k) {
            flag = true;
            ans = root.val;
            return ans;
        }
        kthSmallest(root.right, k);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2, t1, null);
        TreeNode t4 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t2, t4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t5 = new TreeNode(5, t3, t6);

        new Solution0230().kthSmallest(t5, 3);
    }
}
