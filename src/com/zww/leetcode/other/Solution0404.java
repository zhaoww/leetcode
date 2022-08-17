package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 404. 左叶子之和
 *
 * @author weiwei.zhao
 * @since 2022/05/26
 */
public class Solution0404 {
    int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return ans;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                ans += root.left.val;
            } else {
                sumOfLeftLeaves(root.left);
            }
        }
        if (root.right != null) {
            sumOfLeftLeaves(root.right);
        }
        return ans;
    }
}
