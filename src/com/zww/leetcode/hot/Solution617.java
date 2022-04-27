package com.zww.leetcode.hot;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 617. 合并二叉树
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution617 {


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode ans = new TreeNode();
        ans.val = root1.val + root2.val;
        ans.left = mergeTrees(root1.left, root2.left);
        ans.right = mergeTrees(root1.right, root2.right);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3, t5, null);
        TreeNode t1 = new TreeNode(1, t3, t2);

        TreeNode t44 = new TreeNode(4);
        TreeNode t77 = new TreeNode(7);
        TreeNode t11 = new TreeNode(1, null, t44);
        TreeNode t33 = new TreeNode(3, null, t77);
        TreeNode t22 = new TreeNode(2, t11, t33);

        new Solution617().mergeTrees(t1, t22);
    }


}
