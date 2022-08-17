package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 652. Ñ°ÕÒÖØ¸´µÄ×ÓÊ÷
 *
 * @author weiwei.zhao
 * @since 2022/07/14
 */
public class Solution0652 {
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        convert(root);
        return ans;
    }

    private String convert(TreeNode treeNode) {
        if (treeNode == null) {
            return "#";
        }
        String left = convert(treeNode.left);
        String right = convert(treeNode.right);
        String sub = left + "," + right + "," + treeNode.val;
        int cnt = map.getOrDefault(sub, 0);
        if (cnt == 1) {
            ans.add(treeNode);
        }
        map.put(sub, cnt + 1);
        return sub;
    }
}
