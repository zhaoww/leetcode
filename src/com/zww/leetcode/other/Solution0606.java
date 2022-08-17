package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

/**
 * 606. 根据二叉树创建字符串
 *
 * @author weiwei.zhao
 * @since 2022/05/26
 */
public class Solution0606 {
    public String tree2str(TreeNode root) {
        return dfs(root, new StringBuilder());
    }

    public String dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return sb.toString();
        }
        sb.append(root.val);
        // left 不为空
        if (root.left != null) {
            sb.append("(");
            dfs(root.left, sb);
            sb.append(")");
            if (root.right != null) {
                sb.append("(");
                dfs(root.right, sb);
                sb.append(")");
            }
        } else {
            // left 为空， right不为空 （）不可以省略
            if (root.right != null) {
                sb.append("()");
                sb.append("(");
                dfs(root.right, sb);
                sb.append(")");
            }
        }
        return sb.toString();
    }
}
