package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 538. �Ѷ���������ת��Ϊ�ۼ���
 *
 * @author weiwei.zhao
 * @since 2022/07/18
 */
public class Solution0538 {
    int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        root.val += pre;
        pre = root.val;
        convertBST(root.left);
        return root;
    }
}
