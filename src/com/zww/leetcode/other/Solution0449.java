package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * 449. 序列化和反序列化二叉搜索树
 *
 * @author weiwei.zhao
 * @since 2022/05/26
 */
public class Solution0449 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = dfs(root, new StringBuilder());
        return s;
    }

    public String dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N").append(",");
            return sb.toString();
        }
        sb.append(root.val).append(",");
        dfs(root.left, sb);
        dfs(root.right, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        List<String> list = Arrays.asList(split);
        return convert(list);
    }

    public TreeNode convert(List<String> list) {
        if (list.get(0).equals("N")) {
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);

        root.left = convert(list);
        root.right = convert(list);
        return root;
    }

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node5, null);
        TreeNode node1 = new TreeNode(1, node2, node3);
        new Solution0449().serialize(node1);
    }
}
