package com.zww.leetcode.offer;

import com.zww.leetcode.common.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 *
 * @author weiwei.zhao
 * @since 2022/06/21
 */
public class Solution034 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> tmpList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return ans;
        target -= root.val;
        tmpList.add(root.val);

        if (target == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(tmpList));
        }
        pathSum(root.left, target);
        pathSum(root.right, target);
        tmpList.remove(tmpList.size() - 1);

        return ans;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(-3);
        TreeNode root = new TreeNode(-2, null, node);
        new Solution034().pathSum(root, -5);
    }
}
