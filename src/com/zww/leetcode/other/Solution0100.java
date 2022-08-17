package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 100. 相同的树
 *
 * @author 半山兄
 * @since 2022/05/22
 */
public class Solution0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        } else {
            if (p.val != q.val) return false;
            if (!isSameTree(p.left, q.left)) return false;
            if (!isSameTree(p.right, q.right)) return false;
        }

        return true;
    }
}
