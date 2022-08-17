package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 114. ������չ��Ϊ����
 *
 * @author weiwei.zhao
 * @since 2022/07/13
 */
public class Solution0114 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);

        /**** �������λ�� ****/
        // 1�����������Ѿ�����ƽ��һ������
        TreeNode left = root.left;
        TreeNode right = root.right;

        // 2������������Ϊ������
        root.left = null;
        root.right = left;

        // 3����ԭ�ȵ��������ӵ���ǰ��������ĩ��
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
