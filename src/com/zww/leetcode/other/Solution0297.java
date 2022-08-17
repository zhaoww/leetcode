package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 297. 二叉树的序列化与反序列化
 *
 * @author weiwei.zhao
 * @since 2022/05/26
 */
public class Solution0297 {
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
        List<String> list = new ArrayList<>(Arrays.asList(split));
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
}
